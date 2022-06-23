package com.flatnine.bj.service;

import java.util.List;

import com.flatnine.bj.vo.Manufacture;
import com.flatnine.bj.vo.Product;

public interface StockService {
	
	// 공장 목록
	public List<Manufacture> findAllMfg();
	
	// 제품 목록
	public List<Product> findAllProd();
	
	// 선택한 공장의 제품 목록
	public List<Product> findProdByMfg(String mfgName);

}
