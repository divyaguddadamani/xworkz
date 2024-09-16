package com.xworkz.media;

public interface BankRule {
	String name();

	double Balance();

	double WithdrawalLimit();

	double Savings();

	String AccountNumber();

	double TransactionFee();

	double CreditLimit();

	int atmNo();

	int openingHours();

	String ifscCode();

}