package com.eh.graphql.utility;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.springframework.util.CollectionUtils;
/**
 * @author Md. Emran Hossain <emranhos1@gmail.com>
 * @version   1.0.00
 * @since     1.0.00
 */
public class QueryModel implements Serializable {
    private static final long serialVersionUID = 3076617503408105382L;

    private String query;
    private String operationName;
    private Object context;
    private Object root;
    private Map<String, Object> variables;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public Object getContext() {
        return context;
    }

    public void setContext(Object context) {
        this.context = context;
    }

    public Object getRoot() {
        return root;
    }

    public void setRoot(Object root) {
        this.root = root;
    }

    public Map<String, Object> getVariables() {
        if(CollectionUtils.isEmpty(variables)) {
            variables = new HashMap<>();
        }
        return variables;
    }

    public void setVariables(Map<String, Object> variables) {
        this.variables = variables;
    }
}
