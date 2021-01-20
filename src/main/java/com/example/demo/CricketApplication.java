package com.example.demo;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import com.fasterxml.jackson.databind.DeserializationFeature;
import org.springframework.boot.CommandLineRunner;
import com.example.demo.Models.Score;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.Service.Scoreservice;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.demo.Repo.Cricrepo;

@SpringBootApplication
public class CricketApplication {

	public static void main(String[] args) {
		SpringApplication.run(CricketApplication.class, args);
	}
	@Autowired
	Scoreservice scoreservice;

	@Bean
	CommandLineRunner runner(Scoreservice scoreservice) {
		return args -> {
			// read json and write to db
			ObjectMapper mapper = new ObjectMapper();
		TypeReference<List<Score>> typeReference=new TypeReference<List<Score>>() {};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/Json/Cricketers.json");
			try {
				List<Score> scores = mapper.readValue(inputStream,typeReference);
				scoreservice.save(scores);
				System.out.println("crics Saved!");
			} catch (IOException e){
				System.out.println("Unable to save users: " + e.getMessage());
			}
		};
	}
	
	
	
	
	
	
}
