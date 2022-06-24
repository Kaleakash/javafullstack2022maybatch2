package com.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Technologies {
@Id
private int tid;
private String techname;
@ManyToMany

private List<Students> listOfTech;
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getTechname() {
	return techname;
}
public void setTechname(String techname) {
	this.techname = techname;
}
public List<Students> getListOfTech() {
	return listOfTech;
}
public void setListOfTech(List<Students> listOfTech) {
	this.listOfTech = listOfTech;
}

}
