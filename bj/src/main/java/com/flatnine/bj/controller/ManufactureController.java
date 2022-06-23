package com.flatnine.bj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flatnine.bj.service.ManufactureService;
import com.flatnine.bj.vo.Manufacture;
import com.flatnine.bj.vo.Product;

@Controller
@RequestMapping("/manufactures")
public class ManufactureController {
	
	@Autowired
	private ManufactureService manufactureService;
	
	// 전체 공장 목록
	@GetMapping("/list")
	public String findAll(Model theModel) {
		
		List<Manufacture> manufactures = manufactureService.findAll();
		theModel.addAttribute("manufactures", manufactures);
		
		return "manufactures/list-manufactures";
	}
	
	// 공장 등록 서식
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		Manufacture manufacture = new Manufacture();
		theModel.addAttribute("manufacture", manufacture);
		
		return "manufactures/manufacture-form";
	}
	
	// 공장 등록
	@PostMapping("/save")
	public String save(Manufacture manufacture) {
		try {
			manufactureService.saveManufacture(manufacture);
			return "redirect:/manufactures/list";
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		
		return "redirect:";
	}
	
	// 공장 수정 서식
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdateString(@RequestParam("manufactureName") String mfgName, Model theModel) {
		
		Manufacture manufacture = manufactureService.findById(mfgName);
		theModel.addAttribute("manufacture", manufacture);
		
		return "manufactures/manufacture-form";
	}
	
	// 공장 수정
	@PostMapping("/update")
	public String update(Manufacture manufacture) {
		
		try {
			manufactureService.updateManufacture(manufacture);
			return "redirect:/manufactures/list";
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		
		return "redirect:";
	}
	
	
	// 공장 제품 목록 (카드뷰)
	@GetMapping("/productList")
	public String productList(@RequestParam("manufactureName") String mfgName, Model theModel) {
		
		List<Product> products = manufactureService.findProducts(mfgName);
		theModel.addAttribute("products", products);
		
		return "manufactures/list-mfgProducts";
	}
	
	// 공장 제품 목록 (테이블)
	@GetMapping("/showTable")
	public String showTable(@RequestParam("manufactureName") String mfgName, Model theModel) {
		
		List<Product> products = manufactureService.findProducts(mfgName);
		theModel.addAttribute("products", products);
		
		return "manufactures/list-mfg-table";
	}
	
	// 공장 삭제
	@GetMapping("/delete")
	public String deleteManufacture(@RequestParam("manufactureName") String mfgName) {
		
		try {
			manufactureService.deleteManufacture(mfgName);
			return "redirect:/manufactures/list";
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		
		return "redirect:";
	}
	


}
