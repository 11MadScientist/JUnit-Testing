package org.learn.junit;

public class BankAccount
{
	private String firstName;
	private String lastName;
	private double balance;

	public BankAccount(String firstName, String lastName, double balance)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}

	public double deposit(double amount, boolean branch)
	{
		if(amount > 0)
		{
			balance += amount;
			return balance;

		}
		return balance;
	}

	public double withdraw(double amount, boolean branch)
	{
		if(amount > 0)
		{
			double temp = balance - amount;

			if(temp >= 0)
			{
				balance = temp;
				return temp;
			}
		}

		return balance;

	}

	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public double getBalance()
	{
		return balance;
	}

}
