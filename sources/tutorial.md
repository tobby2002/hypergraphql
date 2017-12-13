---
layout: default
title: Tutorial
permalink: /tutorial/
---

<graphiqlconfig>
 <script src="//cdn.jsdelivr.net/es6-promise/4.0.5/es6-promise.auto.min.js"></script>
    <script src="//cdn.jsdelivr.net/fetch/0.9.0/fetch.min.js"></script>
    <script src="//cdn.jsdelivr.net/react/15.4.2/react.min.js"></script>
    <script src="//cdn.jsdelivr.net/react/15.4.2/react-dom.min.js"></script>
        <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/graphiql@0.11.2/graphiql.css" />
    <script src="//cdn.jsdelivr.net/npm/graphiql@0.11.2/graphiql.js"></script>
    <style>
        .graphiql {
            height: 400px;
        }
</style>
</graphiqlconfig>

This will be our first GraphQL service:

<graphiql>
<div class="graphiql" id="tutotial1">Loading...</div>

<script>
    var parameters = {query: "{ try me 1 }"};
    function onEditQuery(newQuery) {
        parameters.query = newQuery;
    }

    function graphQLFetcher(graphQLParams) {
        return fetch('/hypergraphql/service/graphql1', {
            method: 'post',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(graphQLParams),
            credentials: 'include',
        }).then(function (response) {
            return response.text();
        }).then(function (responseBody) {
            try {
                return JSON.parse(responseBody);
            } catch (error) {
                return responseBody;
            }
        });
    }

    ReactDOM.render(
        React.createElement(GraphiQL, {
            fetcher: graphQLFetcher,
            query: parameters.query,
            onEditQuery: onEditQuery,
        }),
        document.getElementById('tutotial1')
    );
</script>
</graphiql>
[See in fullscreen mode](/hypergraphql/service/graphiql1?query={ service 1 }).

This will be our second GraphQL service

<graphiql>
<div class="graphiql" id="tutotial2">Loading...</div>

<script>
    var parameters = {query: "{ try me 2 }"};
    function onEditQuery(newQuery) {
        parameters.query = newQuery;
    }

    function graphQLFetcher(graphQLParams) {
        return fetch('/hypergraphql/service/graphql2', {
            method: 'post',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(graphQLParams),
            credentials: 'include',
        }).then(function (response) {
            return response.text();
        }).then(function (responseBody) {
            try {
                return JSON.parse(responseBody);
            } catch (error) {
                return responseBody;
            }
        });
    }

    ReactDOM.render(
        React.createElement(GraphiQL, {
            fetcher: graphQLFetcher,
            query: parameters.query,
            onEditQuery: onEditQuery,
        }),
        document.getElementById('tutotial2')
    );
</script>
</graphiql>
[See in fullscreen mode](/hypergraphql/service/graphiql2?query={ service 2 }). 

This will be our third GraphQL service:


<graphiql>
<div class="graphiql" id="tutotial3">Loading...</div>

<script>
    var parameters = {query: "{ try me 3 }"};
    function onEditQuery(newQuery) {
        parameters.query = newQuery;
    }

    function graphQLFetcher(graphQLParams) {
        return fetch('/hypergraphql/service/graphql3', {
            method: 'post',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(graphQLParams),
            credentials: 'include',
        }).then(function (response) {
            return response.text();
        }).then(function (responseBody) {
            try {
                return JSON.parse(responseBody);
            } catch (error) {
                return responseBody;
            }
        });
    }

    ReactDOM.render(
        React.createElement(GraphiQL, {
            fetcher: graphQLFetcher,
            query: parameters.query,
            onEditQuery: onEditQuery,
        }),
        document.getElementById('tutotial3')
    );
</script>
</graphiql>
[See in fullscreen mode](/hypergraphql/service/graphiql3?query={ service 3 }). 