package com.pascal.ptm.fhir;

import com.pascal.ptm.entities.Patient;

import java.util.Collections;

public class PatientFhirMapper {

    public static com.pascal.ptm.fhir.FhirPatient toFhir(Patient p) {
        com.pascal.ptm.fhir.FhirPatient fhir = new com.pascal.ptm.fhir.FhirPatient();
        fhir.setId(p.getFhirId());
        fhir.setGender(p.getGender());
        fhir.setBirthDate(p.getBirthDate());

        com.pascal.ptm.fhir.FhirPatient.Name name = new com.pascal.ptm.fhir.FhirPatient.Name();
        name.setFamily(p.getLastName());
        name.setGiven(Collections.singletonList(p.getFirstName()));

        fhir.setName(name);
        return fhir;
    }
}
