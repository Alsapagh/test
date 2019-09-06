package com.egabi.test.test.bootStrap;

import com.egabi.test.test.entities.Emps;
import com.egabi.test.test.repo.EmpRepo;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DoaServices implements ApplicationListener<ContextRefreshedEvent> {

    private EmpRepo empRepo;

    public DoaServices(EmpRepo empRepo) {
        this.empRepo = empRepo;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        insertIntoTable();
    }

    public void insertIntoTable() {
        Emps emp = new Emps();
        emp.setName("Ayman1");
        empRepo.save(emp);

    }

}
