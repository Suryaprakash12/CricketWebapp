package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Score;
import com.example.demo.Repo.Cricrepo;
import com.example.demo.Service.Scoreservice;

@RestController

@RequestMapping("/users")
public class Criccontroller {

@Autowired

private Scoreservice scoreservice;
@Autowired
private Cricrepo cric;
public Criccontroller(Scoreservice scoreservice)
{
	this.scoreservice=scoreservice;
}
@GetMapping("/list")


public Iterable<Score> list() {
    return scoreservice. list();
}






}
