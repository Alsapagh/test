package com.egabi.test.test.repo;

import com.egabi.test.test.entities.Emps;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface EmpRepo extends CrudRepository<Emps,Integer> {

}
