package com.flatnine.bj.dao;

import java.util.List;

import com.flatnine.bj.vo.Customer;

public interface CustomerDAO {
	
	// 전체 조회
	List<Customer> getCustomers();
	
	// 거래처 등록
	void saveCustomer(Customer theCustomer);
	
	// 거래처 수정
	void updateCustomer(Customer theCustomer);
	
	// 상세 조회
	Customer findById(int id);
	
	// 거래처 삭제
	void deleteCustomer(int id);

}
