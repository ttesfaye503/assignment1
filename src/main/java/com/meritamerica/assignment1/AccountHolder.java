package com.meritamerica.assignment1;


public class AccountHolder {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn; 
	private CheckingAccount checkAccount;
	private SavingsAccount saveAccount;

	public AccountHolder() {}
	

	public AccountHolder(String firstName, String middleName, String lastName,
							String ssn, double checkingAccountOpeningBalance,
							double savingsAccountOpeningBalance) {
	
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkAccount = new CheckingAccount(checkingAccountOpeningBalance);
		this.saveAccount = new SavingsAccount(savingsAccountOpeningBalance);
	}

	
	public String getFirstName() {
		return firstName;
	}

		public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSSN() {
		return ssn;
	}

	public void setSSN(String ssn) {
		this.ssn = ssn;
	}

	public CheckingAccount getCheckingAccount() {
		return checkAccount;
	}

	public SavingsAccount getSavingsAccount() {
		return saveAccount;
	}

	@Override
	public String toString() {
		return "\nName: " +  this.getFirstName() + " " + this.getMiddleName() + " " + this.getLastName()
				+ "\nSSN: " + this.getSSN() 
				+ this.getCheckingAccount().toString()
				+ this.getSavingsAccount().toString();
	}	
}