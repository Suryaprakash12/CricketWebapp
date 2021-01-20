package com.example.demo.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonIgnore;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.NonFinal;

import lombok.NonNull;


@Data
@AllArgsConstructor
@Entity
@JsonIgnoreProperties(ignoreUnknown=true)
public class Score {
@Id
@GeneratedValue
@NonNull
private int num;
@NonNull
	
private String uniqueid;
@NonNull
private String name;
@NonNull
private String date;


public Score() {

}
/**
public Score(String uniqueid, String name, String date) {
	super();
	this.uniqueid = uniqueid;
	this.name = name;
	this.date = date;
}
**/
public String getUniqueid() {
	
	return uniqueid;
}
public void setUniqueid(String uniqueid) {
	this.uniqueid = uniqueid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
@Override
public String toString() {
	return "Score [num=" + num + ", uniqueid=" + uniqueid + ", name=" + name + ", date=" + date + "]";
}



}