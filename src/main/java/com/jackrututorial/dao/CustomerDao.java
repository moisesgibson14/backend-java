package com.jackrututorial.dao;

import org.springframework.data.repository.CrudRepository;

import com.jackrututorial.model.Customer;

public interface CustomerDao extends CrudRepository<Customer, Integer> {

}
