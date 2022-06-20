package com.varxyz.banking.domain;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {
	private List<Account> accountList = new ArrayList<Account>();
	private CustomerServiceImpl2 customerService;
	
	public AccountServiceImpl() {
		customerService = new CustomerServiceImpl2();
	}
	
	public Account createSavingsAccount(String accountNum, double balance, double interestRate) {
		return new SavingsAccount(accountNum, balance, interestRate);
	}
	
	public Account createChekingsAccount(String accountNum, double balance, double overdraftAmount) {
		return new CheckingAccount(accountNum, balance, overdraftAmount);
	}
	
	public void addAccount(Account account) {
		accountList.add(account);
	}
	
	public void addAccount(Account account, String ssn) {
		Customer customer = customerService.getCustomerBySsn(ssn);
		account.setCustomer(customer);
	}
	
	public List<Account> getAccountBySsn(String ssn) {
		return null;
	}
	
	public Account getAccountByAccountNum(String accountNum) {
		for(Account c : accountList) {
			if(accountNum.equals(c.getSsn())) {
				return c;
			}
		}
		return null;
	}

	
}
