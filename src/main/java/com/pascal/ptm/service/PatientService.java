package com.pascal.ptm.service;

import com.pascal.ptm.entities.Patient;
import com.pascal.ptm.repo.PatientRepo;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class PatientService {

    private final PatientRepo repo;

    public PatientService(PatientRepo repo) {
        this.repo = repo;
    }

    public void createPatient(Patient patient) throws SQLException {
        repo.save(patient);
    }

    public List<Patient> getAllPatients() {
        return repo.findAll();
    }
}
