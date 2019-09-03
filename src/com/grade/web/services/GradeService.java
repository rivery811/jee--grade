package com.grade.web.services;

import com.grade.web.domains.GradeBean;

public interface GradeService {
	public String createStudentNum(GradeBean param);
	public String gender(GradeBean param);
	public String Date();
	public String randomNum();
	public int sum(GradeBean param);
	public int avg(GradeBean param);

}
