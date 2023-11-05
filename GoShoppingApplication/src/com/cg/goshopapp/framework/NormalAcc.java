package com.cg.goshopapp.framework;

public abstract class NormalAcc extends ShopAcc{
	public float deliveryCharges;
	void bookProduct(float deliveryCharges) {
		
	}
	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + "]";
	}
	

}
