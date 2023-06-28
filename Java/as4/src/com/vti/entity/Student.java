package com.vti.entity;

public class Student {
private int  id;
private String name;
private String homeTown;
private Float academicScore;  

public Student( String name, String homeTown, Float academicScore) {
	this.name = name;
    this.homeTown= homeTown;
    this.academicScore = (float) 0 ;
}

public Float getAcademicScore() {
	return academicScore;
}

public void setAcademicScore(Float academicScore) {
	this.academicScore = academicScore;
}    

public void plusAcademicScore(Float academicScore) {
	this.academicScore = academicScore + academicScore;
	
}

@Override
public String toString() {
	String hocLuc = null;
	if (this.academicScore<=4){
		hocLuc = "yeu";}
	else if (this.academicScore<=6) {
		hocLuc = "trung binh";
	}
	else if (this.academicScore<=8) {
		hocLuc = "kha";
	}
	else if (this.academicScore>8) {
		hocLuc = "gioi";
	}
	
	
	return "Student [name=" + name + ", academicScore=" + academicScore + ", Xep loai = " + hocLuc+"]";
}
}
