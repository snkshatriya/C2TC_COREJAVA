package com.cg.goshopapp.framework;

public abstract class ShopAcc {
	public int accNo;
	public String accNm;
	public float charges;
void bookProduct(float charges) {
	
}
	void items (float charges) {
		
	}


	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
	}
}
