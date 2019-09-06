package com.egabi.test.test.repo;

import com.egabi.test.test.entities.EmployeesEntity;
import com.egabi.test.test.entities.Emps;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmpRepo extends CrudRepository<EmployeesEntity,Long> {

}
