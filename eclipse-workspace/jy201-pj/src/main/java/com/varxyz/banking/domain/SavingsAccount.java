package com.varxyz.banking.domain;

public class SavingsAccount extends Account{
	private double interestRate = 2.5;	// 은행 이자율
	
	public void withdraw(double amount) {
		if (super.balance - amount < 0) {
			// 현재 잔고보다 많은 금액을 출금할시 예외 발생
			throw new InsufficientBalanceException("잔고부족");
		}
		// 현재 잔고보다 작다면 출금 승인
		super.balance -= amount;
	}
}