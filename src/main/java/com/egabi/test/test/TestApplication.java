package com.egabi.test.test;

import com.egabi.test.test.services.DoaServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
		DoaServices doaServices =new DoaServices();
		doaServices.insertIntoTable();
	}

}
