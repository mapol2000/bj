package com.flatnine.bj.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.flatnine.bj.vo.Manufacture;
import com.flatnine.bj.vo.Product;

@Repository
public interface StockDAO {
	
	// 재고 등록
	// 재고 리스트 조회
	// 재고 삭제
	
	// 공장 목록
	List<Manufacture> findAllMfg();
	
	// 제품 목록
	List<Product> findAllProd();
	
	//선택한 공장의 제품 목록
	List<Product> findProdByMfg(String mfgName);

}
