package com.eh.graphql.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.coxautodev.graphql.tools.SchemaParser;
import com.eh.graphql.mutation.MutationResolver;
import com.eh.graphql.query.QueryResolver;
import com.eh.graphql.resolver.PatientQueryResolver;

import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
/**
 * @author    Md. Emran Hossain<emran@medisys.com.sa>
 * @version   1.0.00.GA
 * @since     1.0.00.GA
 */
@Service
public class GraphQLService {

    @Value("classpath:graphql/graphQL.graphqls")
    Resource resource;

    private GraphQL graphQL;

    @Autowired
    private QueryResolver queryResolver;

    @Autowired
    private MutationResolver mutationResolver;

    @Autowired
    private PatientQueryResolver patientResolver;

    @PostConstruct
    private void loadSchema() throws IOException {
        List<GraphQLResolver<?>> list = new ArrayList<>();
        list.add(this.queryResolver);
        list.add(this.mutationResolver);
        list.add(this.patientResolver);

        GraphQLSchema schema = SchemaParser.newParser()
        .file("graphql/graphQL.graphqls")
        .resolvers(list).build()
        .makeExecutableSchema();

        graphQL = GraphQL.newGraphQL(schema).build();
    }

    public GraphQL getGraphQL() {
        return graphQL;
    }
}
