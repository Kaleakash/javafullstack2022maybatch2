package com.medicare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.entity.Medicine;
import com.medicare.service.MedicineService;

@RestController
@RequestMapping("medicine")
@CrossOrigin
public class MedicineController {

	@Autowired
	MedicineService medicineService;
	
	@PostMapping(value = "store",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeMedicine(@RequestBody Medicine md) {
		return medicineService.storeMedicine(md);
	}
	@PutMapping(value = "update",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateMedicine(@RequestBody Medicine md) {
		return medicineService.updateMedicineDetails(md);
	}
	@GetMapping(value="findAllMedicine",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Medicine> getAllMedicine(){
		return medicineService.getAllMedicineDetails();
	}
	@GetMapping(value="findMedicine/{mid}")
	public String getAllMedicine(@PathVariable("mid") int mid){
		return medicineService.findMedicine(mid);
	}
	@DeleteMapping(value="deleteMedicine/{mid}")
	public String deleteMedicine(@PathVariable("mid") int mid){
		return medicineService.deleteMedicineDetails(mid);
	}
	
}
