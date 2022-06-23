package com.flatnine.bj.vo;

public class Stock {
	
	private int id;
	private String productName;
	private String productType;
	private int qty;
	private String inStock;
	private String outStock;
	private String mfgName;
	
	public Stock() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getInStock() {
		return inStock;
	}

	public void setInStock(String inStock) {
		this.inStock = inStock;
	}

	public String getOutStock() {
		return outStock;
	}

	public void setOutStock(String outStock) {
		this.outStock = outStock;
	}

	public String getMfgName() {
		return mfgName;
	}

	public void setMfgName(String mfgName) {
		this.mfgName = mfgName;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", productName=" + productName + ", productType=" + productType + ", qty=" + qty
				+ ", inStock=" + inStock + ", outStock=" + outStock + ", mfgName=" + mfgName + "]";
	}
	
	

}
