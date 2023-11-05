package com.cg.moneymoneybank.application;

import com.cg.moneymoneybank.framework.BankFactory;
import com.cg.moneymoneybank.framework.CurrentAcc;
import com.cg.moneymoneybank.framework.SavingAcc;

public class MMBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalary) {
		MMSavingAcc mmsaving = new MMSavingAcc(accNo, accNm, accBal, isSalary);
		return mmsaving;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo,float accNm, String accBal,float creditLimit) {
		MMCurrentAcc mmCurrentAcc = new MMCurrentAcc(accNo, accBal, accNm, creditLimit);
		return mmCurrentAcc;
		
	}

}
