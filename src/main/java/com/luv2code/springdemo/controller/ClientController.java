package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.entity.Loging;
import com.luv2code.springdemo.service.CustomerService;

@Controller
public class ClientController {

	@Autowired
	private CustomerService customerService;


	@GetMapping("/client/ByLastName")
	public String listoCustomers(Model model, Loging admin) {

		List<Customer> listCustomers = customerService.getCustomers();
		model.addAttribute("customers", listCustomers);

		return "client-list-customers";
	}

	// sortiranje po plati za klient
	@GetMapping("/client/sortBySalary")
	public String listoCustomersBySalary(Model model) {

		List<Customer> listCustomers = customerService.getCustomersBySalary();
		model.addAttribute("customers", listCustomers);

		return "client-list-customers";
	}

	@GetMapping("/client/sortByRegistrationDate")
	public String listoOfCustomersByRegistration(Model model) {

		List<Customer> listCustomers = customerService.getCustomersByRegisterDate();
		model.addAttribute("customers", listCustomers);

		return "client-list-customers";
	}

}
