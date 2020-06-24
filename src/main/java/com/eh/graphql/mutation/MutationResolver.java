package com.eh.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.eh.graphql.entity.Gender;
import com.eh.graphql.entity.Nationality;


public interface MutationResolver extends GraphQLMutationResolver {
    Gender saveGender(Gender gender);
    Gender updateGender(String sexCode, Gender gender);

    Nationality saveNationality(Nationality nationality);
    Nationality updateNationality(String nationalityCode, Nationality nationality);
}
