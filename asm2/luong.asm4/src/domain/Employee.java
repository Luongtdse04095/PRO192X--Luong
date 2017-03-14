package domain;

import java.io.Serializable;

public abstract class Employee implements IEmployee, Serializable {
	private String name;
	private double salaryRadio;

	public abstract int getAllowance(); // phu cap

	public abstract double calculateSalary();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalaryRadio() {
		return salaryRadio;
	}

	public void setSalaryRadio(double salaryRadio) {
		this.salaryRadio = salaryRadio;
	}

	@Override
	public String toString() {
		return null;
	}

}
