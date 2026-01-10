package com.pascal.ptm.examples;

import com.pascal.ptm.entities.Patient;
import com.pascal.ptm.repo.PatientRepo;
import com.pascal.ptm.utils.Datasource;

public class PatientServiceExample {

    public static void main(String[] args) {
        try {
            // Manually create dependencies
            Datasource datasource = new Datasource();
            PatientRepo repo = new PatientRepo(datasource);

            // Create test patient
            Patient p = new Patient();
            p.setFhirId("TEST001");
            p.setFirstName("aisha");
            p.setLastName("joshi");
            p.setGender("female");
            p.setBirthDate("2000-01-01");
            p.setPhone("9800000000");
            p.setEmail("aisha@test.com");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
