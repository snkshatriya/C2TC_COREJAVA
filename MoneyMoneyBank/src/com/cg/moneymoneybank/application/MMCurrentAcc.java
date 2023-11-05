package com.cg.moneymoneybank.application;

import com.cg.moneymoneybank.framework.CurrentAcc;

public class MMCurrentAcc  extends CurrentAcc {
	
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		
	}

public	void withdraw(float creditLimit ) {
	 System.out.println("Dear users ur balance is "+getAccBal()+" after withdrawal balance is "+creditLimit);
		
	}

@Override
public String toString() {
	return "MMCurrentAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ "]";
}


}