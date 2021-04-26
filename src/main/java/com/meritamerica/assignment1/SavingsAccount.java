package com.meritamerica.assignment1;

public class SavingsAccount {
	private double balance;
	private double ir = 0.01;
	public double futureValue;

	public SavingsAccount(double openingBalance) {

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
		return "SavingsAccount [balance=" + balance + ", ir=" + ir + ", futureValue=" + futureValue + "]";
	}

	
}
