package com.jackrututorial.service;

import java.util.List;

import com.jackrututorial.model.*;

public interface CustomerService {

	public List<Customer> getAllCustomer();
	
	public Customer getCustomerById(int id);
	
	public Customer addCustomer(Customer customer);
	
	public void updateCustomer(Customer customer);
	
	public void deleteCustomer(int id);
	
//	public void updateViewNotification(Customer customer);
	
	
}
