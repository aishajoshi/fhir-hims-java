package com.pascal.ptm.repo;

import com.pascal.ptm.entities.Patient;
import com.pascal.ptm.utils.Datasource;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PatientRepo {

    private final Datasource datasource;

    public PatientRepo(Datasource datasource) {
        this.datasource = datasource;
    }

    public void save(Patient p) throws SQLException {
        String sql = "INSERT INTO patient (fhir_id, first_name, last_name, gender, birth_date, phone, email, active) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = datasource.getConnection().prepareStatement(sql)) {
            stmt.setString(1, p.getFhirId());
            stmt.setString(2, p.getFirstName());
            stmt.setString(3, p.getLastName());
            stmt.setString(4, p.getGender());
            stmt.setString(5, p.getBirthDate());
            stmt.setString(6, p.getPhone());
            stmt.setString(7, p.getEmail());
            stmt.setBoolean(8, p.isActive());
            stmt.executeUpdate();
        }
    }

    public List<Patient> findAll() {
        List<Patient> patients = new ArrayList<>();
        String sql = "SELECT * FROM patient";

        try (
                Connection conn = datasource.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()
        ) {
            while (rs.next()) {
                Patient p = new Patient();
                p.setId(rs.getLong("id"));
                p.setFhirId(rs.getString("fhir_id"));
                p.setFirstName(rs.getString("first_name"));
                p.setLastName(rs.getString("last_name"));
                p.setGender(rs.getString("gender"));
                p.setBirthDate(rs.getString("birth_date"));
                p.setPhone(rs.getString("phone"));
                p.setEmail(rs.getString("email"));
                p.setActive(rs.getBoolean("active"));
                patients.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return patients;
    }
}
