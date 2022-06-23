package com.varxyz.jv250.banking;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AccountDaoTest {
	public static void main(String[] args) {
		AccountDao dao = new AccountDao();
		
		SavingsAccount sa = new SavingsAccount();
		sa.setAccountNum("567-59-0123");
		sa.setBalance(45000.0);
		sa.setCustomer(new Customer(1006));
		sa.setInterestRate(0.04);
		sa.setRegDate(new Date());
		sa.setAccountType('S');
		
		dao.addAccount(sa);
		for (Account account : dao.findAccountsBySsn("961578-1523267")) {
			System.out.println(account);
		}
	}
}
