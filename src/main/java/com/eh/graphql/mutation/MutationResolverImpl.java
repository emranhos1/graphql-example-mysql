package com.eh.graphql.mutation;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.eh.graphql.entity.Gender;
import com.eh.graphql.entity.Nationality;
import com.eh.graphql.repository.GenderRepository;
import com.eh.graphql.repository.NationalityRepository;

@Component
public class MutationResolverImpl implements MutationResolver {

    @Autowired
    GenderRepository genderRepository;

    @Autowired
    NationalityRepository nationalityRepository;

    @Override
    public Gender saveGender(Gender gender) {
        gender.setEntryDate(new java.sql.Date(new Date().getTime()));
        gender.setEntryUser("0001");

        genderRepository.save(gender);
        return gender;
    }

    @Override
    public Gender updateGender(String sexCode, Gender gender) {

        Gender entity = genderRepository.findById(gender.getSexCode()).get();
        if(!ObjectUtils.isEmpty(entity)) {
            entity.setUpdateDate(new java.sql.Date(new Date().getTime()));
            entity.setUpdateUser("0002");
            entity.setSexCode(sexCode);
            entity.setGenderName(gender.getGenderName());
            entity.setShortGenderName(gender.getShortGenderName());

            genderRepository.save(entity);
        }
        return entity;
    }

    @Override
    public Nationality saveNationality(Nationality nationality) {
            nationality.setEntryDate(new java.sql.Date(new Date().getTime()));
            nationality.setEntryUser("0001");

            nationalityRepository.save(nationality);
            return nationality;
    }

    @Override
    public Nationality updateNationality(String nationalityCode, Nationality nationality) {
        Nationality hasNationality = nationalityRepository.findById(nationality.getNationalityCode()).get();

        if(!ObjectUtils.isEmpty(hasNationality)) {
            hasNationality.setUpdateDate(new java.sql.Date(new Date().getTime()));
            hasNationality.setUpdateUser("0002");
            hasNationality.setNationalityCode(nationalityCode);
            hasNationality.setNationalityName(nationality.getNationalityName());
            hasNationality.setNationalityShortName(nationality.getNationalityShortName());

            nationalityRepository.save(hasNationality);
        }
        return hasNationality;
    }
}