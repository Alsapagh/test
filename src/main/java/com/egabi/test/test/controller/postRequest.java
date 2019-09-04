package com.egabi.test.test.controller;

import com.egabi.test.test.services.DoaServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class postRequest {

    @RequestMapping("/insert")
    public void example() {
        DoaServices my = new DoaServices();
        my.insertIntoTable();
        System.out.println("All Done !! ");
    }
}
