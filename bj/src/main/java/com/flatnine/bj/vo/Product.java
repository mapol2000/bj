package com.flatnine.bj.vo;

public class Product {
	
	private int id;
	private String productName;
	private String kind;
	private String regDate;
	private String mfgName;
	private String memo;
	private String imagename;
	private String imagepath;
	
	public Product() {
		
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

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getMfgName() {
		return mfgName;
	}

	public void setMfgName(String mfgName) {
		this.mfgName = mfgName;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getImagename() {
		return imagename;
	}

	public void setImagename(String imagename) {
		this.imagename = imagename;
	}

	public String getImagepath() {
		return imagepath;
	}

	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", kind=" + kind + ", regDate=" + regDate
				+ ", mfgName=" + mfgName + ", memo=" + memo + ", imagename=" + imagename + ", imagepath=" + imagepath
				+ "]";
	}

	

}
