package com.egabi.test.test.bootStrap;

import com.egabi.test.test.entities.EmployeesEntity;
import com.egabi.test.test.entities.Emps;
import com.egabi.test.test.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.sql.Time;

@Component
public class DoaServices implements ApplicationListener<ContextRefreshedEvent> {

    private EmpRepo empRepo;
@Autowired
    public DoaServices(EmpRepo empRepo) {
        this.empRepo = empRepo;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        insertIntoTable();
    }

    public void insertIntoTable() {
        EmployeesEntity emp = new EmployeesEntity();
        emp.setEmployeeId(1200);
        emp.setFirstName("Ayman");
        emp.setHireDate(new Time(System.currentTimeMillis()));
        emp.setLastName("Alsapagh");
        emp.setEmail("Ayman.alsapagh@yahoo.com");
        emp.setJobId("AD_VP");

        empRepo.save(emp);

    }

}
