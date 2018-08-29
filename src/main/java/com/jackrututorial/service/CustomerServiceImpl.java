package com.jackrututorial.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jackrututorial.dao.CustomerDao;
import com.jackrututorial.model.Customer;

@Component
public class CustomerServiceImpl implements CustomerService	 {
	
	@Autowired
	CustomerDao customerDao;
	
	private static List<Customer> customers = new ArrayList<>();
	
	static {
		Customer jack1 = new Customer(1,223, "Retiro", "se realizo un retiro", "this is a example", "www.google.com",false);
		Customer jack2 = new Customer(2,432, "Deposito a cheques", "se realizo un deposito a cheques", "this is a example ", "www.google.com",false);
		Customer jack3 = new Customer(3,435, "Deposito a cuenta", "se realizo un deposito a cuenta", "this is a example ", "www.google.com",false);
		
		customers.add(jack1);
		customers.add(jack2);
		customers.add(jack3);
	}
	
	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return (List<Customer>) customerDao.findAll();
	}

	@Override
	public Customer getCustomerById(int id) {
		for(Customer customer : customers) {
			if(customer.getId() == id) {
				return customer;
			}
		}
		return null;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int nextId  = random.nextInt(1000) + 10;
		
		customer.setId(nextId);
		customers.add(customer);
		
		customerDao.save(customer);
		
		return customer;
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		for(Customer oldCustomer : customers) {
			if(oldCustomer.getId() == customer.getId()) {
				oldCustomer.setTitle(customer.getTitle());
				oldCustomer.setSubTitle(customer.getSubTitle());
				oldCustomer.setDescription(customer.getDescription());
			}
		}
		
	}

	@Override
	public void deleteCustomer(int id) {
		for(Customer c : customers) {
			if(c.getId() == id) {
				customers.remove(c);
			}
		}
		
	}

}
