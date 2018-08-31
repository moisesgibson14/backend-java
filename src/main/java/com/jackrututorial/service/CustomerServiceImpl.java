package com.jackrututorial.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jackrututorial.dao.CustomerDao;
import com.jackrututorial.model.Customer;

@Component
public class CustomerServiceImpl implements CustomerService	 {
	
	@Autowired
	CustomerDao customerDao;

	
	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return (List<Customer>) customerDao.findAllO();
	}

	@Override
	public Customer getCustomerById(int id) {
		for(Customer customer : customerDao.findAll()) {
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
		
		LocalDateTime now = LocalDateTime.now();
		customer.setSend_date(now);
		
		customerDao.save(customer);
		return customer;
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Optional<Customer> customById = customerDao.findById(customer.getId());
	  Customer custom = customById.get();
	  System.out.println(custom);
	  custom = customer;
	  customerDao.save(custom);
		
	}

	@Override
	public void deleteCustomer(int id) {
		for(Customer c : customerDao.findAll()) {
			if(c.getId() == id) {
				customerDao.delete(c);
			}
		}
		
	}

}
