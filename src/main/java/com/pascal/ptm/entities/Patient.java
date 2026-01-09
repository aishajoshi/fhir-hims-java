package com.pascal.ptm.entities;

public class Patient {
    private String  fhir_id;
    private String first_name;
    private String last_name;
    private String gender;
    private String birthdate;
    private String address;
    private String email;
    private String phone;
public String getFhir_id() {
    return fhir_id;
}
public void setFhir_id(String fhir_id) {
    this.fhir_id = fhir_id;
}
public String getFirst_name() {
    return first_name;
}
public void setFirst_name(String first_name) {
    this.first_name = first_name;
}
public String getLast_name() {
    return last_name;
}
public void setLast_name(String last_name) {
    this.last_name = last_name;
}
public String getGender() {
    return gender;
}
public void setGender(String gender) {
    this.gender = gender;
}
public String getBirthdate() {
    return birthdate;
}
public void setBirthdate(String birthdate) {
    this.birthdate = birthdate;
}
public String getAddress() {
    return address;
}
public void setAddress(String address) {
    this.address = address;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getPhone() {
    return phone;
}
public void setPhone(String phone) {
    this.phone = phone;
}
@Override
public String toString() {
    return "Patient{" +
            "fhir_id='" + fhir_id + '\'' +
            ", first_name='" + first_name + '\'' +
            ", last_name='" + last_name + '\'' +
            ", gender='" + gender + '\'' +
            ", birthdate='" + birthdate + '\'' +
            ", address='" + address + '\'' +
            ", email='" + email + '\'' +
            ", phone='" + phone + '\'' +
            '}';
}
}


