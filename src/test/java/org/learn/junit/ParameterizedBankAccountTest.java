package org.learn.junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedBankAccountTest
{
	private BankAccount acct;

	// you need to create the data parameters and a constructor for the
	// parameterized test
	private double amount;
	private boolean branch;
	private double expected;

	public ParameterizedBankAccountTest(double amount, boolean branch, double expected)
	{
		this.amount = amount;
		this.branch = branch;
		this.expected = expected;
	}

	@Before
	public void setup()
	{
		acct = new BankAccount("Tim", "Duncan", 1000.00);
	}

	// values for the parameters
	@Parameters
	public static Collection<Object []> testConditions()
	{
		return Arrays.asList(new Object [] [] { { 100.00, true, 1100.00 }, { 200.00, true, 1200 },
				{ 325.14, true, 1325.14 }, { 489.33, true, 1489.33 }, { 1000.00, true, 2000.00 } });
	}

	@Test
	public void testGetBalance_deposit()
	{
		acct.deposit(amount, branch);
		System.out.println(acct.getBalance());
		assertEquals(expected, acct.getBalance(), .1);
//		fail("Error: " + acct.getBalance());
	}

}
