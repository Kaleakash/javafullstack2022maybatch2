package com.service;

import java.util.List;

import com.bean.Trainer;
import com.dao.TrainerDao;

public class TrainerService {

	TrainerDao td = new TrainerDao();
	
	
	public String storeTrainerDetails(Trainer trainer) {
		if(td.storeTrainerDetails(trainer)>0) {
			return "Trainer record stored successfully";
		}else {
			return "Trainer record didn't store";
		}
	}
	
	public Trainer findTrainer(int tid) {
		return td.findTrainerById(tid);
	}
	
	public List<Object[]> findTrainerAndStudent() {
		return td.joinTrainerAndStudent();
	}
	
	public List<Object[]> findTrainerAndStudentWithCondition(String tname){
		return td.joinTrainerAndStudentWithCondition(tname);
	}
}
