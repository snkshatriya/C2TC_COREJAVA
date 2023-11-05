package com.cg.moneymoneybank.application;

import com.cg.moneymoneybank.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	private static final float MINBAL=100.0f;
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal,isSalary);
		
	}
	
	
public void withdraw(float accBal) {
	System.out.println("Dear user ur savings is : "+accBal);
		
	}


@Override
public String toString() {
	return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ "]";
}
	



}
