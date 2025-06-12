package com.example.patientService.controller;


import com.example.patientService.entity.Patient;
import com.example.patientService.entity.PatientDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PatientController {

    @PostMapping("/patients")
    @ResponseBody
    public String createPatient(@RequestBody PatientDTO patient){
        return "New Patient created";
    }

    @GetMapping("/patients")
    @ResponseBody
    public List<Patient> getPatients(){
        return new ArrayList<Patient>();
    }

    @GetMapping("/patients/{id}")
    @ResponseBody
    public Patient getPatients(@PathVariable int id){
        return new Patient();
    }

    @PutMapping("/patients/{id}")
    @ResponseBody
    public Patient updatePatients(@RequestBody PatientDTO patient, @PathVariable int id){
        return new Patient();
    }

    @DeleteMapping("patients/{id}")
    @ResponseBody
    public String deletePatient(@PathVariable int id){
        return "Patient deleted";
    }

    @GetMapping("/search?name={name}")
    @ResponseBody
    public List<Patient> searchPatients(@PathVariable String name){
        return new ArrayList<Patient>();
    }
}
