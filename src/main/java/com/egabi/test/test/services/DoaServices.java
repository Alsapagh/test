package com.egabi.test.test.services;

import com.egabi.test.test.entities.Emps;
import com.egabi.test.test.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@Component
public class DoaServices {

    @Autowired
    EmpRepo empRepo;

    @RequestMapping(value = "/insert")
    public  void insertIntoTable() {
        Emps emp = new Emps();
        emp.setName("Ayman1");
        empRepo.save(emp);
        emp.setName("Ayman2");
        empRepo.save(emp);
        emp.setName("Ayman3");
        empRepo.save(emp);
        emp.setName("Ayman4");
        empRepo.save(emp);
        emp.setName("Ayman5");
        empRepo.save(emp);
        emp.setName("Ayman6");
        empRepo.save(emp);


    }
}
