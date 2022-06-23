package com.flatnine.bj.dao;

import java.util.List;

import com.flatnine.bj.vo.Manufacture;
import com.flatnine.bj.vo.Product;

public interface ManufactureDAO {
	
	// 전체 공장 조회
	List<Manufacture> findAll();
	
	// 공장 제품 조회
	List<Product> findProducts(String mfgName);
	
	// 공장 등록
	void saveManufacture(Manufacture manufacture);
	
	// 공장 상세 조회
	Manufacture findById(String mfgName);
	
	// 공장 수정
	void updateManufacture(Manufacture manufacture);
	
	// 공장 삭제
	void deleteManufacture(String mfgName);

}
