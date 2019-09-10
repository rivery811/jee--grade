package com.grade.web.domains;

import java.io.Serializable;

public class StudentBean implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private String ssn, name, studentNum ;
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "StudentBean [ssn=" + ssn + ", name=" + name + ", studentNum=" + studentNum + "]";
	}
	
	

}
