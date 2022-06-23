package com.flatnine.bj.service;

import java.util.List;

import com.flatnine.bj.vo.Manufacture;
import com.flatnine.bj.vo.Product;

public interface ManufactureService {
	
	public List<Manufacture> findAll();
	
	public List<Product> findProducts(String mfgName);
	
	public void saveManufacture(Manufacture manufacture);
	
	public Manufacture findById(String mfgName);
	
	public void updateManufacture(Manufacture manufacture);
	
	public void deleteManufacture(String mfgName);

}
