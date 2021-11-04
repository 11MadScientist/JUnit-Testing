package org.learn.junit;

public class Main
{

	public static void main(String [] args)
	{
		BankAccount acct = new BankAccount("Tim", "Duncan", 1000.00);
		System.out.println(acct.getFirstName());
	}
}
