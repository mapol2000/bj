package com.flatnine.bj.dao;

import java.util.List;

import com.flatnine.bj.vo.Product;

public interface ProductDAO {
	
	// 전체 조회
	List<Product> findAll();
	
	// 제품 등록
	void saveProduct(Product product);
	
	// 제품 수정
	void updateProduct(Product product);
	
	// 상세 조회
	Product findById(int id);
	
	// 제품 삭제
	void deleteProduct(int id);

}
