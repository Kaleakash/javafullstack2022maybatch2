package com.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Students {
@Id
private int sid;
private String sname;
@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(name = "student_technology",joinColumns = {@JoinColumn(name="sid")},inverseJoinColumns = {@JoinColumn(name="tid")})
private List<Technologies> listOfTech;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public List<Technologies> getListOfTech() {
	return listOfTech;
}
public void setListOfTech(List<Technologies> listOfTech) {
	this.listOfTech = listOfTech;
}

}
