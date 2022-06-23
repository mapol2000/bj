package com.flatnine.bj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/stock")
public class StockController {
	
	
	@GetMapping("/list")
	public String findAll(Model theModel) {
		
		
		
		return "stock/list-stock";
	}

}
