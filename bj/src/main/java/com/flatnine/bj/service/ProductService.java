package com.flatnine.bj.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.flatnine.bj.vo.Product;

public interface ProductService {
	
	// 전체 조회
	public List<Product> findAll();
		
	// 제품 등록
	public void saveProduct(Product product, MultipartFile file);
		
	// 제품 수정
	public void updateProduct(Product product);
		
	// 상세 조회
	public Product findById(int id);
		
	// 제품 삭제
	public void deleteProduct(int id);

}
