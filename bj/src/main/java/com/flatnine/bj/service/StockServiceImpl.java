package com.flatnine.bj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flatnine.bj.dao.StockDAO;
import com.flatnine.bj.vo.Manufacture;
import com.flatnine.bj.vo.Product;

@Service
public class StockServiceImpl implements StockService {
	
	@Autowired
	private StockDAO stockDAO;

	// 모든 공장 조회
	@Override
	public List<Manufacture> findAllMfg() {
		return stockDAO.findAllMfg();
	}

	// 모든 제품 조회
	@Override
	public List<Product> findAllProd() {
		return stockDAO.findAllProd();
	}

	@Override
	public List<Product> findProdByMfg(String mfgName) {
		return stockDAO.findProdByMfg(mfgName);
	}

}
