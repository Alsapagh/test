package com.egabi.test.test.controller;

import com.egabi.test.test.repo.EmpRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmpsController {
    private EmpRepo empRepo;

    public EmpsController(EmpRepo empRepo) {
        this.empRepo = empRepo;
    }

    @RequestMapping(value = "/emps",method = RequestMethod.GET)
    private String getEmps(Model model) {
        model.addAttribute("emps", empRepo.findAll());
        return "emps";
    }

}
