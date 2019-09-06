package com.egabi.test.test.controller;

import com.egabi.test.test.repo.EmpRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpsController {
    private EmpRepo empRepo;

    public EmpsController(EmpRepo empRepo) {
        this.empRepo = empRepo;
    }

    @RequestMapping(value = "/emps")
    private String getEmps(Model model) {
        model.addAttribute("emps", empRepo.findAll());
        return "emps";
    }

}
