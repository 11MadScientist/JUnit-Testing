package org.learn.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest
{

	private BankAccount acct;

	@Before
	public void test()
	{
		acct = new BankAccount("Tim", "Duncan", 1000.00);
		System.out.println("Running Test");
	}

	@Test
	public void testDeposit()
	{
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
		acct.deposit(200, false);

		assertEquals(1200, acct.getBalance(), 0);
	}

	@Test
	public void testWithdraw()
	{
		double balance = acct.withdraw(200, false);

		assertEquals(800, balance, 0);
	}

	@Test
	public void testGetBalance_withdraw()
	{
		acct.withdraw(200, false);

		assertEquals(800, acct.getBalance(), 0);
	}

	@Test
	public void testGetFirstName()
	{

		assertEquals("Tim", acct.getFirstName());

	}

	@Test
	public void testGetLastName()
	{

		assertEquals("Duncan", acct.getLastName());
	}

}
