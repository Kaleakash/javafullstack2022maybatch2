package com.medicare.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.entity.Medicine;
import com.medicare.repository.MedicineRepository;

@Service
public class MedicineService {

	@Autowired
	MedicineRepository medicineRepository;
	
	public String storeMedicine(Medicine medicine) {
		medicineRepository.save(medicine);
		return "Record stored successfully";
	}
	
	public List<Medicine> getAllMedicineDetails() {
		return medicineRepository.findAll();
	}
	
	public String findMedicine(int mid) {
		Optional<Medicine> result = medicineRepository.findById(mid);
		if(result.isPresent()) {
			Medicine md = result.get();
			return md.toString();
		}else {
			return "Medicine details not availabe with id as "+mid;
		}
	}
	
	public String deleteMedicineDetails(int mid) {
		Optional<Medicine> result = medicineRepository.findById(mid);
		if(result.isPresent()) {
			Medicine md = result.get();
			medicineRepository.delete(md);
			return "Medicine details deleted successfully";
		}else {
			return "Medicine details not availabe with id as "+mid;
		}
	}
	
	public String updateMedicineDetails(Medicine md) {
		Optional<Medicine> result = medicineRepository.findById(md.getMid());
		if(result.isPresent()) {
			Medicine md1 = result.get();
				md1.setPrice(md.getPrice());
				md1.setQuantity(md.getQuantity());
				
				medicineRepository.saveAndFlush(md1);
			return "Medicine details updated successfully";
		}else {
			return "Medicine details not availabe with id as "+md.getMid();
		}
	}
	
}
