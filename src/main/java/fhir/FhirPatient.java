package com.pascal.ptm.fhir;

import java.util.List;

public class FhirPatient {

    private String resourceType = "Patient";
    private String id;
    private Name name;
    private String gender;
    private String birthDate;

    public static class Name {
        private String family;
        private List<String> given;

        public String getFamily() { return family; }
        public void setFamily(String family) { this.family = family; }

        public List<String> getGiven() { return given; }
        public void setGiven(List<String> given) { this.given = given; }
    }

    public String getResourceType() { return resourceType; }
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getBirthDate() { return birthDate; }
    public void setBirthDate(String birthDate) { this.birthDate = birthDate; }
}
