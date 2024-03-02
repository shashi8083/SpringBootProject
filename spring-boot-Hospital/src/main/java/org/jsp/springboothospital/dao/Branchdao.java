package org.jsp.branch.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.branch.Repository.BranchRepository;
import org.jsp.branch.dto.Branch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class BranchDao {
	@Autowired
	private BranchRepository branchRepository;
	
	public Branch saveBranch(Branch branch){
		return branchRepository.save(branch);
	}
	
	public Optional<Branch> findById(int id){
		return branchRepository.findById(id);
	}
	
   public List<Branch> findAll(Branch branch) {
	   return branchRepository.findAll();
   }

}