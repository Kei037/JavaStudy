package com.varxyz.jy200.mod006;

import java.util.Date;
import java.util.Objects;

public class Employee {
	protected String name;
	protected double salary;
	public MyDate birthDate;


	public boolean equals (Object obj) {
		if ( obj instanceof Employee ) {
			Employee e = (Employee) obj;
			if (e.getName().equals(name) && e.getBirthDate().equals(birthDate) ) {
				return true;
			}
		}
		return false;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;   //유비
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;   // 1000.0
	}

	public MyDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;    // 10, 4, 2000
	}

	public String getDetails() {
		return "Name: " + name + "\nSalary: " + salary;
	}
	
	public void add() {
		int getPrice = 0;
		System.out.println(getPrice);
	}
}