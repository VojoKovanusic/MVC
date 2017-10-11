package com.luv2code.springdemo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.entity.Loging;
import com.luv2code.springdemo.service.CustomerService;

 @Controller
public class AdminController {

	@Autowired
	private CustomerService customerService;

	//da posalje na adminovu listu, koja ima druge mogucnosti:dodvanje, editovanja, dugmadi....
	@GetMapping("/admin/home")
	public String listoOfCustomers(Model model,Loging admin) {

		List<Customer> listCustomers = customerService.getCustomersByLastName();
		model.addAttribute("customers", listCustomers);
		
			return "admin-list-customer";
	}
//sortiranje po plati za admina
	@GetMapping("/admin/sortBySalary")
	public String listoOfCustomersBySalary(Model model) {

		List<Customer> listCustomers = customerService.getCustomersBySalary();
		model.addAttribute("customers", listCustomers);
	 
		return "admin-list-customer";
	}
	
	
	@GetMapping("/admin/sortByRegistrationDate")
	public String listoOfCustomersByRegistration(Model model) {

		List<Customer> listCustomers = customerService.getCustomersByRegisterDate();
		model.addAttribute("customers", listCustomers);
	 
		return "admin-list-customer";
	}	
 

	@GetMapping("/admin/showFormADD")
	public String showFormForADD(Model model) {

		Customer customer = new Customer();
		model.addAttribute("customer", customer);

		return "add-customer";
	}


	// za validaciju
	@PostMapping("/admin/saveCustomer")
	public String saveCustomer( @ModelAttribute("customer") @Valid Customer customer, BindingResult binding) {
		if (binding.hasErrors()) {
			return "add-customer";
		} else {
			customerService.saveCustomer(customer);

			return "redirect:/admin/home";
		}
		
	}

	@GetMapping("/admin/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int id, Model model) {
		// get customer from the service(no DB)
		Customer customer = customerService.getCustomer(id);

		model.addAttribute("customer", customer);

		return "add-customer";
	}

	@GetMapping("/admin/delete")
	public String deleteCustomer(@RequestParam("customerId") int id) {
		customerService.deleteCustomer(id);

		return "redirect:/admin/home";
	}
 
}
