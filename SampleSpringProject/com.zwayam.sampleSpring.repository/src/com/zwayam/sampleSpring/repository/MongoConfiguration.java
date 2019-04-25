package com.zwayam.sampleSpring.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories(basePackages = "com.zwayam.sampleSpring.repository")
public class MongoConfiguration extends AbstractMongoConfiguration{
	
	private String host;
	private Integer port;
	private String dbName;
	
	@Value("${mongodb.host}")
	public void setHost(String host){
		this.host = host;
	}
	
	@Value("${mongodb.port}")
	public void setPort(Integer port){
		this.port = port;
	}
	
	@Value("${mongodb.dbName}")
	public void setDBName(String dbName){
		this.dbName = dbName;
	}
	
	@Override
	protected String getDatabaseName(){
		return dbName;
	}
	
	@Override
	public Mongo mongo() throws Exception{
		MongoClient client = new MongoClient(host,port);
		return client;
	}
	
}
