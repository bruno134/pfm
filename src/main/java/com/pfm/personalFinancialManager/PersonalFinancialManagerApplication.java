package com.pfm.personalFinancialManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.pfm.personalFinancialManager.config.DataAccessConfig;
import com.pfm.personalFinancialManager.controller.BancoController;

@SpringBootApplication
@ComponentScan(basePackageClasses={BancoController.class})
public class PersonalFinancialManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalFinancialManagerApplication.class, args);
	}
}
