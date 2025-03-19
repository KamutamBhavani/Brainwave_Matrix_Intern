package com;

import java.util.Scanner;

public class MainApplication {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Bank b=new Bank(100);
	while(true)
	{
		System.out.println("****ATM MENU****");
		System.out.println("check balance");
		System.out.println("withDraw Money");
		System.out.println("deposit Money");
		System.out.println("exit");
		System.out.println("enter the choice");
	    int choice=sc.nextInt();
	switch(choice)
	{
	case 1:b.CheckBalance();
           break;
	
	case 2:System.out.println("enter the amount you want to withdraw");
		   double withDrawAmount=sc.nextDouble();
		   b.withDraw(withDrawAmount);
		   break;
		
	case 3:System.out.println("enter the amount you want to deposit");
		   double depositAmount=sc.nextDouble();
	       b.depositMoney(depositAmount);
	       break;
		
	case 4:System.out.println("Thank you for choosing our atm");
		   System.exit(0);
	default:
		   System.out.println("please enter the valid choice");
		
	}
	}
}
}
