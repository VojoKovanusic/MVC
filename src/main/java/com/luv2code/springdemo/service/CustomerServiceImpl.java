
package com.luv2code.springdemo.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;

	@Override

	public ArrayList<Customer> getCustomers() {

		return (ArrayList<Customer>) customerDAO.findAll();
	}

	@Override

	public void saveCustomer(Customer customer) {
		customerDAO.save(customer);
	}

	@Override

	public Customer getCustomer(int id) {

		return customerDAO.findOne(id);
	}

	@Override

	public void deleteCustomer(int id) {
		customerDAO.delete(id);
	}

	@Override

	public ArrayList<Customer> getCustomersBySalary() {
		ArrayList<Customer> list = getCustomers();
		Collections.sort(list, (c1, c2) -> c2.getSalary().compareTo(c1.getSalary()));
	//	Collections.sort(list, Comparator.comparing(Customer::getSalary));
		return list;
	}

	@Override
	public List<Customer> getCustomersByRegisterDate() {
		ArrayList<Customer> list = getCustomers();
		Collections.sort(list, (c1, c2) -> c2.getRegistrationDate().compareTo(c1.getRegistrationDate()));
		//Collections.sort(list, Comparator.comparing(Customer::getRegistrationDate));

		return list;
	}

	@Override
	public List<Customer> getCustomersByLastName() {
		ArrayList<Customer> list=getCustomers();
		Collections.sort(list,(c1,c2)->c1.getLastName().compareTo(c2.getLastName()));
		return list;
	}
}
