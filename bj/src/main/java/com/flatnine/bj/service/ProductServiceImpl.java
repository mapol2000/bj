package com.flatnine.bj.service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.flatnine.bj.dao.ProductDAO;
import com.flatnine.bj.vo.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDAO;

	@Override
	public List<Product> findAll() {
		return productDAO.findAll();
	}

	@Override
	public void saveProduct(Product product, MultipartFile file) {

		String projectPath = System.getProperty("user.dir") + "\\src\\main\\resources\\static\\files";
		  
		UUID uuid = UUID.randomUUID();
		  
		String fileName = uuid + "_" + file.getOriginalFilename();
		  
		File saveFile = new File(projectPath, fileName);
		 
		try {
			file.transferTo(saveFile);
			product.setImagename(fileName);
			product.setImagepath("/files/" + fileName);
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 

		productDAO.saveProduct(product);
	}

	@Override
	public void updateProduct(Product product) {
		productDAO.updateProduct(product);
	}

	@Override
	public Product findById(int id) {
		return productDAO.findById(id);
	}

	@Override
	public void deleteProduct(int id) {
		productDAO.deleteProduct(id);
	}

}
