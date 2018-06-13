package org.websparrow.business;

import org.websparrow.exception.InvalidAcNoException;

public class Bank {

	private String accountNo = "XYZ123";
	private int amount = 1000;

	public int deposit(int amount, String acNo) {

		if (acNo.equals(this.accountNo)) {

			System.out.println("inside deposit method...");

			this.amount = this.amount + amount;
			return this.amount;

		} else {
			throw new InvalidAcNoException();
		}
	}
}
