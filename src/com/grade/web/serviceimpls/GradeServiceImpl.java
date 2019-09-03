package com.grade.web.serviceimpls;

import com.grade.web.daoimpls.GradeDaoImpl;
import com.grade.web.daos.GradeDao;
import com.grade.web.domains.GradeBean;
import com.grade.web.services.GradeService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class GradeServiceImpl implements GradeService {
	
	private GradeDao dao;
	
	public GradeServiceImpl() {
		dao = new GradeDaoImpl();
	}
	

	@Override
	public String createStudentNum(GradeBean param) {
		String result = "";
		result = Date()+"-"+gender(param)+randomNum();
		param.setStudentNum(result);
		dao.insertGrade(param);
		
		System.out.println("학번"+result);
	
		return result ;
		
	}
	
	public String gender(GradeBean param) {
	
		return param.getSsn().substring(7,8); 
	}
	
	public String Date() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String result = sdf.format(date);

		return result;
		
	}
	
	public String randomNum() {
		String result = "";
		Random ran = new Random();
		for(int i = 0; i<3; i++) {
			result+=String.valueOf(ran.nextInt(10));
		}
		return result ;
		
		
		
	}

	@Override
	public int sum(GradeBean param) {
		int kor = param.getKor();
		int eng =param.getEng();
		int math = param.getMath();
		int soc = param.getSoc();
		
		int sum = kor+eng+math+soc;
		
		System.out.println("합"+sum);

		return sum;
	}

	@Override
	public int avg(GradeBean param) {
		int avg =sum(param)/4;
		
		System.out.println("평균"+ avg);

		return avg;
	}

}
