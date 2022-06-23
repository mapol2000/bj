package com.flatnine.bj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flatnine.bj.dao.CustomerDAO;
import com.flatnine.bj.vo.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDAO customerDAO;

	@Override
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		customerDAO.saveCustomer(theCustomer);
	}

	@Override
	public void updateCustomer(Customer theCustomer) {
		customerDAO.updateCustomer(theCustomer);
	}

	@Override
	public Customer findById(int id) {
		return customerDAO.findById(id);
	}

	@Override
	public void deleteCustomer(int id) {
		customerDAO.deleteCustomer(id);
		
	}

}
