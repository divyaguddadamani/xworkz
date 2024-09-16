package com.xworkz.implement;

import com.xworkz.media.BankRule;

public class SBIBank implements BankRule{

	@Override
	public String name() {
		System.out.println("run name");
		return null;
	}

	@Override
	public double Balance() {
		System.out.println("run Balance");
		return 0;
	}

	@Override
	public double WithdrawalLimit() {
		System.out.println("run WithdrawalLimit");
		return 0;
	}

	@Override
	public double Savings() {
	System.out.println("run Savings");
		return 0;
	}

	@Override
	public String AccountNumber() {
		System.out.println("run AccountNumber");
		return null;
	}

	@Override
	public double TransactionFee() {
		System.out.println("run TransactionFee");
		return 0;
	}

	@Override
	public double CreditLimit() {
		System.out.println("run CreditLimit");
		return 0;
	}

	@Override
	public int atmNo() {
		System.out.println("run atmNo");
		return 0;
	}

	@Override
	public int openingHours() {
		System.out.println("run openingHours");
		return 0;
	}

	@Override
	public String ifscCode() {
		System.out.println("run ifscCode");
		return null;
	}

}
