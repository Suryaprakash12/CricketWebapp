package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.Cricrepo;

import java.util.List;

//import com.example.demo.Domain.User;
//import com.sun.tools.javac.util.List;
import com.example.demo.Models.Score;

@Service
public class Scoreservice {
	@Autowired
	private Cricrepo cric;
	
	public Scoreservice(Cricrepo cric)
	{
		this.cric=cric;
	}

	public Iterable<Score> list() {
		// TODO Auto-generated method stub
		return cric.findAll();
	}
	

	  public Score save(Score score) {
	        return cric.save(score);
	  }
	       
	
	public Iterable <Score> save(List<Score> scores) {
		return cric.saveAll(scores);
		// TODO Auto-generated method stub
		
	}
	
	
	
		
	}
	

	

