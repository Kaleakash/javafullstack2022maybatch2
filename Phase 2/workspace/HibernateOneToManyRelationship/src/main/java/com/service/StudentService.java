package com.service;

import com.bean.Student;
import com.dao.StudentDao;

public class StudentService {

		StudentDao sd = new StudentDao();
		
		public String storeStudentDetails(Student student) {
			if(sd.storeStudentDetails(student)>0) {
				return "Student record stored successfully";
			}else {
				return "Student record didn't store";
			}
		}
}
