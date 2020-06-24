package com.eh.graphql.query;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.eh.graphql.entity.Gender;
import com.eh.graphql.entity.Nationality;
import com.eh.graphql.entity.Patient;

public interface QueryResolver extends GraphQLQueryResolver {
    List<Nationality> getNationalities();
    Nationality getNationality(String id);

    List<Gender> getGenders();
    Gender getGender(String id);

    List<Patient> getPatients();
    Patient getPatient(String id);
}
