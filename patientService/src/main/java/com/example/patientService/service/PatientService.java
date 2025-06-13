package com.example.patientService.service;

import com.example.patientService.entity.Patient;
import com.example.patientService.entity.PatientDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {
    public Patient creatPatient(PatientDTO patient){
        //jpa save - repo.save(patient)
        return new Patient();
    }

    public List<Patient> listPatients(){
        // repo.listPatients;
        return new ArrayList<>();
    }

    public Patient getPatient(int id){
        //patient find by id
        return new Patient();
    }

    public Patient updatePatient(int id, PatientDTO patient){
        return new Patient();
    }

    public int deletePatient(int id){
        return 0;
    }

    public Patient searchPatient(String name){
        return new Patient();
    }
}
