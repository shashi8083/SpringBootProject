package org.jsp.springboothospital.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.springboothospital.dto.Hospital;
import org.jsp.springboothospital.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HospitalDao {
	
	@Autowired
	private HospitalRepository hospitalRepository;
	
	public Hospital saveHospital(Hospital hospital) {
		return hospitalRepository.save(hospital);
	}
	public Optional<Hospital> findById(int id) {
		return hospitalRepository.findById(id);
	}
	public List<Hospital> findAll(Hospital hospital) {
		return hospitalRepository.findAll();
	}
}
