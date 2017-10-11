package com.luv2code.springdemo.dao;

 
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImp  {//implements CustomerDAO

/*	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {
		// get the curenty
		Session sesion = sessionFactory.getCurrentSession();

		Query<Customer> query = sesion.createQuery("from Customer order by lastName", Customer.class);

		List<Customer> customers = query.getResultList();

		return customers;
	}

	@Override
	public void saveCustomer(Customer customer) {
		Session sesion = sessionFactory.getCurrentSession();
		sesion.saveOrUpdate(customer);
	}

	@Override
	public Customer getCustomer(int id) {
		Session sesion = sessionFactory.getCurrentSession();
		Customer customer = sesion.get(Customer.class, id);
		return customer;
	}

	@Override
	public void deleteCustomer(int id) {
		Session session = sessionFactory.getCurrentSession();

		Query query = session.createQuery("delete from Customer where id=:customerId");
		query.setParameter("customerId", id);
		query.executeUpdate();

	}

	@Override
	public List<Customer> getCustomersBySalary() {
		Session sesion = sessionFactory.getCurrentSession();

		Query<Customer> query = sesion.createQuery("from Customer order by salary desc", Customer.class);

		List<Customer> customers = query.getResultList();
		return customers;
	}

	@Override
	public List<Customer> getCustomersByRegisterDate() {
		Session sesion = sessionFactory.getCurrentSession();

		Query<Customer> query = sesion.createQuery("from Customer order by registrationDate", Customer.class);

		List<Customer> customers = query.getResultList();
		return customers;
	}
*/
}
