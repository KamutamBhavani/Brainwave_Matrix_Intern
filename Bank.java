package com;

public class Bank implements ATMInterface {
 private double balance;
 public Bank(double InitialBalance)
 {
	 this .balance=InitialBalance;
 }
	@Override
	public void CheckBalance() {
		System.out.println("Your balance is "+balance);
	}

	@Override
	public void withDraw(double amount) {
	if(amount>0&&amount<=balance)
	{
		balance=balance-amount;
		System.out.println("you have withdrawn the amount"+amount);
		CheckBalance();
	}
	else if(amount>balance)
	{
		System.out.println("you dont have insufficient balance");
	}
	else
	{
		System.out.println("enter the valid amount");
	}
		
	}

	@Override
	public void depositMoney(double amount) {
		if(amount>0)
		{
			balance=balance+amount;
			System.out.println("sucessfully deposited in bank"+amount);
			CheckBalance();
		}
		else
		{
			System.out.println("invali deposit amount");
		}
		
	}

}
