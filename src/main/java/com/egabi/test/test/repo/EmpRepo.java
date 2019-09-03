package com.egabi.test.test.repo;

import com.egabi.test.test.entities.Emps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository<Emps,Integer> {

}
