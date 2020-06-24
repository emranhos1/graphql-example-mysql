package com.eh.graphql.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.eh.graphql.entity.Gender;
import com.eh.graphql.entity.Nationality;
import com.eh.graphql.entity.Patient;
import com.eh.graphql.repository.GenderRepository;
import com.eh.graphql.repository.NationalityRepository;

@Component
public class PatientQueryResolverImpl implements PatientQueryResolver {

    @Autowired
    NationalityRepository NationalityRepository;

    @Autowired
    GenderRepository GenderRepository;

    @Override
    public Nationality getNationality(Patient patient) {
        String id = patient.getNationalityCode();

        if (!StringUtils.isEmpty(id)) {
            return NationalityRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public Gender getGender(Patient patient) {
        String id = patient.getGenderCode();

        if (!StringUtils.isEmpty(id)) {
            return GenderRepository.findById(id).get();
        }
        return null;
    }
}
