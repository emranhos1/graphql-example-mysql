package com.eh.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.eh.graphql.entity.Gender;
import com.eh.graphql.entity.Nationality;
import com.eh.graphql.entity.Patient;

public interface PatientQueryResolver extends GraphQLResolver<Patient> {
    Nationality getNationality(Patient patient);
    Gender getGender(Patient patient);
}
