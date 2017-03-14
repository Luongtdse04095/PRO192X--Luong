package domain;

import java.io.Serializable;

public class Officer extends Employee implements Serializable{
	private String department;
	private int workingDays;
	private int position;

	// 0. Name: => extends Emloyee
	// 1. Set Department:

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	// 2. Set Working days:

	public int getWorkingDays() {
		return workingDays;
	}

	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}

	// 3. Salary Radio (he so luong): => entends Employee
	// 4. Return Postition:

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	/*
	 * 1 -> department head (Truong phong) 2 -> vice head (Pho phong) 3 -> staff
	 */
	public String isPosition() {
		if (position == 1) {
			return "Department Head";
		}
		if (position == 2) {
			return "Voice head";
		}
		return "Staff";
	}

	// 5. Allowance: (phu cap)

	@Override
	public int getAllowance() {
		if (position == 1) {
			return 2000;
		}
		if (position == 2) {
			return 1000;
		}
		return 500;
	}

	// 6. Salary:

	@Override
	public double calculateSalary() {
		return getSalaryRadio() * 730 + getAllowance() + workingDays * 30;
	}

	// 7. Display:
	@Override
	public String toString() {
		return " Officer | " + "Name: " + getName() + " " + "|" + " " + "Department: " + getDepartment() + " " + "|"
				+ " " + "Working Day: " + getWorkingDays() + " " + "|" + " " + "Salary Radio: " + getSalaryRadio() + " "
				+ "|" + " " + "Position: " + isPosition() + " " + "|" + " " + "Allowance: " + getAllowance() + " " + "|"
				+ " " + "Salary: " + calculateSalary();
	}

}