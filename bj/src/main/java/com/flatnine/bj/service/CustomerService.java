package com.flatnine.bj.service;

import java.util.List;

import com.flatnine.bj.vo.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();
	
	public void saveCustomer(Customer theCustomer);
	
	public void updateCustomer(Customer theCustomer);
	
	public Customer findById(int id);
	
	public void deleteCustomer(int id);

}
