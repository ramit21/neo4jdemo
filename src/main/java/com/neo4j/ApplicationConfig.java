package com.neo4j;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.config.Neo4jConfiguration;


@Configuration
@EnableNeo4jRepositories
public class ApplicationConfig extends Neo4jConfiguration {
	public ApplicationConfig() {
		setBasePackage("com.neo4j");
	}

	@Bean
	GraphDatabaseService graphDatabaseService() {
		return new GraphDatabaseFactory().newEmbeddedDatabase("accessingdataneo4j.db");
	}
}
