package com.flatnine.bj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flatnine.bj.service.StockService;
import com.flatnine.bj.vo.Manufacture;
import com.flatnine.bj.vo.Product;
import com.flatnine.bj.vo.Stock;

@Controller
@RequestMapping("/stock")
public class StockController {
	
	@Autowired
	private StockService stockService;
	
	
	@GetMapping("/list")
	public String findAll(Model theModel) {
		
		
		
		return "stock/list-stock";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(String mfgName, Model theModel) {
		
		Stock stock = new Stock();
		theModel.addAttribute("stock", stock);
		
		// 공장목록
		List<Manufacture> manufactures = stockService.findAllMfg();
		theModel.addAttribute("manufactures", manufactures);
		
		// 제품목록
		List<Product> products = stockService.findAllProd();
		theModel.addAttribute("products", products);
		
		// 선택한 공장의 제품 목록
		List<Product> prodByMfg = stockService.findProdByMfg(mfgName);
		theModel.addAttribute("prodByMfg", prodByMfg);
		
		return "stock/form-stock-add";
	}

}
