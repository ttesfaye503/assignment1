package com.meritamerica.assignment1;

public class CheckingAccount {
	private double balance;
	private double ir = 0.0001;
	private double futureValue;

	public CheckingAccount(double openingBalance) {

		balance = openingBalance;
	}

	public double getBalance() {
		return balance;
	}

	public double getInterestRate() {
		return ir;
	}

	boolean withdraw(double amount) {
		if (amount < 0) {
			return false;
		}
		if (amount > balance) {
			return false;
		}
		balance -= amount;
		return true;
	}

	boolean deposit(double amount) {
		if (amount < 0) {
			return false;
		}
		balance += amount;
		return true;
	}

	double futureValue(int years) {
		return balance * Math.pow(1 + ir, years);
	}

	@Override
	public String toString() {
		return "CheckingAccount [balance=" + balance + ", ir=" + ir + ", futureValue=" + futureValue + "]";
	}


}
