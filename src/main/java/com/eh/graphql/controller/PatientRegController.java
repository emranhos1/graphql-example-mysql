package com.eh.graphql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eh.graphql.repository.PatientRepository;
import com.eh.graphql.service.GraphQLService;
import com.eh.graphql.utility.QueryModel;

import graphql.ExecutionInput;
import graphql.ExecutionResult;
/**
 * @author Md. Emran Hossain <emranhos1@gmail.com>
 * @version   1.0.00
 * @since     1.0.00
 */
@RestController
@RequestMapping("/rest/graphql")
public class PatientRegController {

    @Autowired
    GraphQLService graphQLService;

    @Autowired
    PatientRepository patientRepository;

    @PostMapping(consumes = { MediaType.TEXT_PLAIN_VALUE })
    public ResponseEntity<Object> exeQuery(@RequestBody String query) {
        ExecutionResult execute = graphQLService.getGraphQL().execute(query);
        return new ResponseEntity<>(execute, HttpStatus.OK);
    }

    @PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<Object> exeQueryByModel(@RequestBody QueryModel model) {
        ExecutionInput executionInput = ExecutionInput.newExecutionInput()
            .operationName(model.getOperationName())
            .variables(model.getVariables())
            .context(model.getContext())
            .root(model.getContext())
            .query(model.getQuery())
            .build();
        ExecutionResult execute = graphQLService.getGraphQL().execute(executionInput);
        return new ResponseEntity<>(execute, HttpStatus.OK);
    }

//    @GetMapping
//    public List<Patient> getPatients() {
//        return patientRepository.findAll();
//    }
}
