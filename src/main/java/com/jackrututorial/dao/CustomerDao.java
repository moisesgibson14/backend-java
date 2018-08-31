package com.jackrututorial.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jackrututorial.model.Customer;

public interface CustomerDao extends CrudRepository<Customer, Integer> {

	@Query(value="select * from customer order by send_date desc", nativeQuery = true)
	List<Customer> findAllO();
}
