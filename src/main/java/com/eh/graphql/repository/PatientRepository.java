package com.eh.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eh.graphql.entity.Patient;
/**
 * @author Md. Emran Hossain <emranhos1@gmail.com>
 * @version 1.0.00
 * @since   1.0.00
 */
public interface PatientRepository extends JpaRepository<Patient, String> {

}
