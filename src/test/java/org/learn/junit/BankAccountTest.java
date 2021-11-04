package org.learn.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BankAccountTest
{

	@Test
	public void testDeposit()
	{
		BankAccount acct = new BankAccount("Tim", "Duncan", 1000.00);
		double balance = acct.deposit(200, false);

		// when comparing doubles we can choose to use the version of the method that
		// has the third parameter (delta parameter), it allows some lee-ways in the
		// comparison as long as the difference between the two values is within the
		// delta we specify, then the insertion will pass.
		assertEquals(1200, balance, 0);
	}

	@Test
	public void testGetBalance_deposit()
	{
		BankAccount acct = new BankAccount("Tim", "Duncan", 1000.00);
		acct.deposit(200, false);

		assertEquals(1200, acct.getBalance(), 0);
	}

	@Test
	public void testWithdraw()
	{
		BankAccount acct = new BankAccount("Tim", "Duncan", 1000.00);
		double balance = acct.withdraw(200, false);

		assertEquals(800, balance, 0);
	}

	@Test
	public void testGetBalance_withdraw()
	{
		BankAccount acct = new BankAccount("Tim", "Duncan", 1000.00);
		acct.withdraw(200, false);

		assertEquals(800, acct.getBalance(), 0);
	}

	@Test
	public void testGetFirstName()
	{
		BankAccount acct = new BankAccount("Tim", "Duncan", 1000.00);

		assertEquals("Tim", acct.getFirstName());
	}

	@Test
	public void testGetLastName()
	{
		BankAccount acct = new BankAccount("Tim", "Duncan", 1000.00);

		assertEquals("Duncan", acct.getLastName());
	}

}
