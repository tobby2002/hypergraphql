package org.hypergraphql.datafetching.services;

import com.fasterxml.jackson.databind.JsonNode;
import org.apache.jena.query.ResultSet;
import org.apache.jena.rdf.model.Model;
import org.hypergraphql.datafetching.TreeExecutionResult;

import java.util.Set;

public class SPARQLEndpointService extends SPARQLService {

    private String url;
    private String user;
    private String password;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public SPARQLEndpointService() {

    }

    @Override
    public TreeExecutionResult executeQuery(JsonNode query, Set<String> input, String rootType) {




        ResultSet results = null;
        //todo
        Model model = getModelFromResults(results);

        //todo : Szymon
        return null;
    }

    private Model getModelFromResults(ResultSet results) {
        //todo


        return null;

    }

    @Override
    public void setParameters(JsonNode jsonnode) {

        super.setParameters(jsonnode);

        this.id = jsonnode.get("@id").asText();
        this.url = jsonnode.get("url").asText();
        this.user = jsonnode.get("user").asText();
        this.password = jsonnode.get("password").asText();

    }
}
