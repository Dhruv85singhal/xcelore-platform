package com.xcelore;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {
    private List<Patient> patients = new ArrayList<>();
    private Long patientId = 1L;

    public Patient addPatient(Patient patient) {
        patient.setId(patientId++);
        patients.add(patient);
        return patient;
    }

    public List<Patient> getAllPatients() {
        return patients;
    }
}
