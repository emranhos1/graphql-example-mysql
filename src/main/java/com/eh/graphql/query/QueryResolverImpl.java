package com.eh.graphql.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.eh.graphql.entity.Gender;
import com.eh.graphql.entity.Nationality;
import com.eh.graphql.entity.Patient;
import com.eh.graphql.repository.GenderRepository;
import com.eh.graphql.repository.NationalityRepository;
import com.eh.graphql.repository.PatientRepository;

@Component
public class QueryResolverImpl implements QueryResolver {

    @Autowired
    NationalityRepository nationalityRepository;

    @Autowired
    GenderRepository genderRepository;

    @Autowired
    PatientRepository patientRepository;

    @Override
    public List<Nationality> getNationalities() {
        return nationalityRepository.findAll();
    }

    @Override
    public Nationality getNationality(String id) {
        if (!StringUtils.isEmpty(id)) {
        return nationalityRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public List<Gender> getGenders() {
        return genderRepository.findAll();
    }

    @Override
    public Gender getGender(String id) {
        if (!StringUtils.isEmpty(id)) {
            return genderRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public List<Patient> getPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatient(String id) {
        if (!StringUtils.isEmpty(id)) {
            return patientRepository.findById(id).get();
        }
        return null;
    }
}