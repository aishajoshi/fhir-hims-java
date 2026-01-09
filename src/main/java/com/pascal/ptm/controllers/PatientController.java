package com.hims.fhir.controller;

import ca.uhn.fhir.context.FhirContext;
import com.hims.fhir.service.PatientService;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Patient;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fhir/patient")
public class PatientController {

    private final PatientService patientService;
    private final FhirContext fhirContext;

    public PatientController(PatientService patientService,
                             FhirContext fhirContext) {
        this.patientService = patientService;
        this.fhirContext = fhirContext;
    }

    // CREATE PATIENT
    @PostMapping
    public String createPatient(@RequestBody String patientJson) {

        Patient patient = fhirContext
                .newJsonParser()
                .parseResource(Patient.class, patientJson);

        patientService.createPatient(patient);

        return fhirContext
                .newJsonParser()
                .encodeResourceToString(patient);
    }

    // GET PATIENT BY ID
    @GetMapping("/{id}")
    public String getPatient(@PathVariable String id) {

        Patient patient = patientService.getPatientById(id);

        return fhirContext
                .newJsonParser()
                .encodeResourceToString(patient);
    }

    // GET ALL PATIENTS
    @GetMapping
    public String getAllPatients() {

        Bundle bundle = new Bundle();
        bundle.setType(Bundle.BundleType.SEARCHSET);

        patientService.getAllPatients().forEach(p ->
                bundle.addEntry().setResource(p)
        );

        return fhirContext
                .newJsonParser()
                .encodeResourceToString(bundle);
    }
}
