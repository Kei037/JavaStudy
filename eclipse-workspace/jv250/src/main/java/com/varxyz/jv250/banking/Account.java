package com.varxyz.jv250.banking;

import java.util.Date;

public class Account {
	protected long aid;
	protected String accountNum;	// 계좌번호
	protected double balance;		// 잔액
	protected static Customer customer;
	protected Date regDate;
	protected char accountType;
	
	public char getAccountType() {
		return accountType;
	}

	public void setAccountType(char accountType) {
		this.accountType = accountType;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Account () {
		
	}
	
	public Account(String accountNum, double balance) {
		this.accountNum = accountNum;
		this.balance = balance;
	}

	public long getAid() {
		return aid;
	}

	public void setAid(long aid) {
		this.aid = aid;
	}

	public void deposite(double amount) {	// 입금기능 메소드
		this.balance += amount;
	}
	
	public String getAccountNum() {
		return accountNum;
	} 
	
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}

	@Override
	public String toString() {
		return "Account [aid=" + aid + ", accountNum=" + accountNum + ", balance="
				+ balance + ", regDate=" + regDate
				+ ", accountType=" + accountType + "]";
	}
	
	
	
}
