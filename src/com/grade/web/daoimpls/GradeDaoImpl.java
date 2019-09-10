package com.grade.web.daoimpls;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.grade.web.daos.GradeDao;
import com.grade.web.domains.GradeBean;

public class GradeDaoImpl implements GradeDao{
	public static final String FILEPATH =String.format("C:%sUsers%suser%seclipse-jee%sjee-grade%sWebContent%sresources%stxt%s"
            ,File.separator,File.separator,File.separator,File.separator,File.separator,File.separator,File.separator,File.separator);

	@Override
	public void insertGrade(GradeBean param) {
		System.out.println("직전"+param.toString());
		try {
			File file = new File(FILEPATH+"grade.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
		//	writer.write(String.format("%s %s %s %d %d %d %d"			
	                      // 	, param.getStudentNum(), param.getSsn(),param.getName(), param.getKor(), param.getEng(),param.getMath(),param.getSoc()));
					
			writer.newLine();
			writer.flush();
	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
