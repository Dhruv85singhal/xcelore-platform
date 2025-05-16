package com.xcelore;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorService {
    private List<Doctor> doctors = new ArrayList<>();
    private Long doctorId = 1L;

    public Doctor addDoctor(Doctor doctor) {
        doctor.setId(doctorId++);
        doctors.add(doctor);
        return doctor;
    }

    public List<Doctor> getAllDoctors() {
        return doctors;
    }
}
