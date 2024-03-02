package org.jsp.mechantbootadmin.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.mechantbootadmin.dto.Admin;
import org.jsp.mechantbootadmin.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDao {
@Autowired
private AdminRepository adminRepository;

public Admin saveAdmin(Admin admin) {
	return adminRepository.save(admin);
}
public Optional<Admin> findById(int id){
	return adminRepository.findById(id);
}
public List<Admin> findAll(){
	return adminRepository.findAll();
}
public List<Admin> findByName(String name){
	return adminRepository.findByName(name);
}
public boolean deleteById(int id) {
	Optional<Admin> recAdmin = findById(id);
	if(recAdmin.isPresent()) {
		adminRepository.delete(recAdmin.get());
		return true;
	}
	return false;
}
//public Optional<Admin> verify(long phone,String password){
//	return adminRepository.verify(phone,password);
//}
}
