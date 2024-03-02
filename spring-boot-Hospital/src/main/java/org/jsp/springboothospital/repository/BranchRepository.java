package org.jsp.branch.Repository;

import org.jsp.branch.dto.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch, Integer> {

}
