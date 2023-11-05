package com.cg.moneymoneybank.framework;

public abstract class CurrentAcc extends BankAcc{
	private float creditLimit=100.0f;
	

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	


public float getCreditLimit() {
		return creditLimit;
	}



	public void setCreditLimit(float creditLimit) {
		this.creditLimit = creditLimit;
	}



public void withdraw(float creditLimit) {
	 System.out.println("Your balance is : "+creditLimit);
		
	}
 

@Override
public String toString() {
	return "CurrentAcc [creditLimit=" + creditLimit + "]";
}


}
