package com.flatnine.bj.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.flatnine.bj.service.ProductService;
import com.flatnine.bj.vo.Manufacture;
import com.flatnine.bj.vo.Product;

@Controller
@RequestMapping("/products")
public class ProductController {
	
	private ProductService productService;
	
	public ProductController(ProductService theProductService) {
		productService = theProductService;
	}
	
	// 제품 조회(카드뷰)
	@GetMapping("/list")
	public String findAll(Model theModel) {
		List<Product> products = productService.findAll();
		theModel.addAttribute("products", products);
		
		return "products/list-products";
	}
	
	// 제품 조회(테이블)
	@GetMapping("/showTable")
	public String showTable(Model theModel) {
		List<Product> products = productService.findAll();
		theModel.addAttribute("products", products);
		
		return "products/list-products-table";
	}
	
	@GetMapping("/detail")
	public String detail(@RequestParam("productId") int id, Model theModel) {
		Product product = productService.findById(id);
		theModel.addAttribute("product", product);
		
		return "products/detail";
	}
	
	// 제품 등록 서식
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		Product product = new Product();
		theModel.addAttribute("product", product);
		
		// 공장 목록 받아오기
		List<Manufacture> manufactures = productService.findAllMfg();
		theModel.addAttribute("manufactures", manufactures);
		
		return "products/product-form";
	}
	
	@PostMapping("/save")
	public String saveProduct(Product product, MultipartFile file) throws Exception {
		
		try {
			productService.saveProduct(product, file);
			return "redirect:/products/list";
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		
		return "redirect:";
	}
	
	@PostMapping("/update")
	public String updateProduct(Product product) {
		try {
			productService.updateProduct(product);
			return "redirect:/products/list";
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		
		return "redirect:";
		
	}
	
	// 제품 수정 서식
	@GetMapping("showFormForUpdate")
	public String showFormForUpdate(@RequestParam("productId") int id, Model theModel) {
		
		Product product = productService.findById(id);
		theModel.addAttribute("product", product);
		
		// 공장 목록 받아오기
		List<Manufacture> manufactures = productService.findAllMfg();
		theModel.addAttribute("manufactures", manufactures);
		
		return "products/product-form";
	}
	
	@GetMapping("/delete")
	public String deleteProduct(@RequestParam("productId") int id) {
		try {
			productService.deleteProduct(id);
			return "redirect:/products/list";
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		
		return "redirect:";
	}
	
	
	

}
