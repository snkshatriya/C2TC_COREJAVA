package com.cg.moneymoneybank.client;

import com.cg.moneymoneybank.application.MMBankFactory;
import com.cg.moneymoneybank.application.MMCurrentAcc;
import com.cg.moneymoneybank.framework.BankFactory;
import com.cg.moneymoneybank.framework.CurrentAcc;
import com.cg.moneymoneybank.application.MMSavingAcc;
import com.cg.moneymoneybank.framework.SavingAcc;


public class Client {

	public static void main(String[] args) {
	BankFactory bf=new MMBankFactory();
	SavingAcc sa=new MMSavingAcc(1,"saving",2000.0f,false);
	sa.withdraw(sa.getAccBal());
	sa.toString();	
	CurrentAcc ca=new MMCurrentAcc(2,"current",100.0f,500.0f);
	ca.withdraw(ca.getCreditLimit());
	ca.toString();
	

	}

}
