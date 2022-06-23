package com.flatnine.bj.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flatnine.bj.service.CustomerService;
import com.flatnine.bj.vo.Customer;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	
	private CustomerService customerService;
	
	public CustomerController(CustomerService theCustomerService) {
		customerService = theCustomerService;
	}
	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		
		List<Customer> theCustomers = customerService.getCustomers();
		
		theModel.addAttribute("allCustomers", theCustomers);
		
		return "customers/list-customers";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		Customer theCustomer = new Customer();
		
		theModel.addAttribute("customer", theCustomer);
		
		return "customers/customer-form";
	}
	
	@PostMapping("/save")
	public String saveCustomer(Customer theCustomer) {
		try {
			customerService.saveCustomer(theCustomer);
			return "redirect:/customers/list";
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		
		return "redirect:";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int id, Model theModel) {
		Customer customer = customerService.findById(id);
		theModel.addAttribute("customer", customer);
		
		return "customers/customer-form";
	}
	
	@PostMapping("/update")
	public String updateCustomer(Customer theCustomer) {
		try {
			customerService.updateCustomer(theCustomer);
			return "redirect:/customers/list";
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		
		return "redirect:";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int id) {
		try {
			customerService.deleteCustomer(id);
			return "redirect:/customers/list";
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		
		return "redirect:";
	}

}
