
package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Score;

import java.util.List;

public interface Cricrepo extends JpaRepository<Score,Integer> {

	void save(List<Score> scores);

	//Iterable<Score> save(java.util.List<Score> scores);

}




