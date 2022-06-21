package com.varxyz.banking.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.varxyz.banking.domain.Customer;

public class CustomerServiceImpl implements CustomerService {
	private Map<String, Customer> map = new HashMap<String, Customer>();
	
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	public Customer getCustomerBySsn(String ssn) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getNumOfCustomers() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}