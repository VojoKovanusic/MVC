package com.luv2code.springdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.luv2code.springdemo.entity.Customer;

public interface CustomerDAO extends CrudRepository<Customer, Integer>{
	
/*	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomer(int id);

	public void deleteCustomer(int id);

	public List<Customer> getCustomersBySalary();

	public List<Customer> getCustomersByRegisterDate();*/

	 
}
