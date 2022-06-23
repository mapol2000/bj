package com.flatnine.bj.vo;

public class Manufacture {
	
	private String mfgName;
	private String mfgHp;
	private String mfgAddr;
	
	public Manufacture() {
		
	}

	public String getMfgName() {
		return mfgName;
	}

	public void setMfgName(String mfgName) {
		this.mfgName = mfgName;
	}

	public String getMfgHp() {
		return mfgHp;
	}

	public void setMfgHp(String mfgHp) {
		this.mfgHp = mfgHp;
	}

	public String getMfgAddr() {
		return mfgAddr;
	}

	public void setMfgAddr(String mfgAddr) {
		this.mfgAddr = mfgAddr;
	}

	@Override
	public String toString() {
		return "Manufacture [mfgName=" + mfgName + ", mfgHp=" + mfgHp + ", mfgAddr=" + mfgAddr + "]";
	}

	
	
	

}
