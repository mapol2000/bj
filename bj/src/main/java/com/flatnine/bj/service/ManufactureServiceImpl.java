package com.flatnine.bj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flatnine.bj.dao.ManufactureDAO;
import com.flatnine.bj.vo.Manufacture;
import com.flatnine.bj.vo.Product;

@Service
public class ManufactureServiceImpl implements ManufactureService {
	
	@Autowired
	private ManufactureDAO manufactureDAO;
	

	@Override
	public List<Manufacture> findAll() {
		return manufactureDAO.findAll();
	}


	@Override
	public List<Product> findProducts(String mfgName) {
		return manufactureDAO.findProducts(mfgName);
	}


	@Override
	public void saveManufacture(Manufacture manufacture) {
		
		manufactureDAO.saveManufacture(manufacture);
	}


	@Override
	public Manufacture findById(String mfgName) {
		return manufactureDAO.findById(mfgName);
	}


	@Override
	public void updateManufacture(Manufacture manufacture) {
		
		manufactureDAO.updateManufacture(manufacture);
	}


	@Override
	public void deleteManufacture(String mfgName) {

		manufactureDAO.deleteManufacture(mfgName);
	}

}
