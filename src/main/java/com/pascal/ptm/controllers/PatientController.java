package com.pascal.ptm.controllers;

import com.pascal.ptm.entities.Patient;
import com.pascal.ptm.fhir.FhirPatient;
import com.pascal.ptm.fhir.PatientFhirMapper;
import com.pascal.ptm.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/patient")
public class PatientController {

    private final PatientService service;

    public PatientController(PatientService service) {
        this.service = service;
    }

    @PostMapping
    public String create(@RequestBody Patient patient) throws SQLException {
        service.createPatient(patient);
        return "Patient created";
    }

    @GetMapping
    public List<FhirPatient> getAll() {
        return service.getAllPatients()
                .stream()
                .map(PatientFhirMapper::toFhir)
                .collect(Collectors.toList());
    }
}
