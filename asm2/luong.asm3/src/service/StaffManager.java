package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import domain.Professor;
import domain.Employee;
import domain.Officer;

public class StaffManager {
	ArrayList<Employee> list = new ArrayList<>();
	ArrayList<Employee> searchList = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	// 1. Menu [1]: Enter staffs� information
	// 1.1 Input Teacher

	Professor inputTeacher() {
		Professor t = new Professor();
		System.out.print("Name: ");
		t.setName(scan.next());

		System.out.print("Ratio Salary: ");
		t.setSalaryRadio(scan.nextInt());

		System.out.print("Falcuty: ");
		t.setFalcuty(scan.next());

		System.out.print("Degree (1= Bacherlor, 2= Master, 3= Doctor): ");
		t.setDegree(scan.nextInt());

		System.out.print("Working time: ");
		t.setTeachingTime(scan.nextInt());

		return t;
	}

	// 1.2 Input Officer

	Officer inputOfficer() {

		Officer o = new Officer();
		System.out.print("Name: ");
		o.setName(scan.next());

		System.out.print("Ratio Salary: ");
		o.setSalaryRadio(scan.nextInt());

		System.out.print("Department: ");
		o.setDepartment(scan.next());

		System.out.print("Position (1=Department Head, 2=Voice head, 3= Staff ): ");
		o.setPosition(scan.nextInt());

		System.out.print("Working days: ");
		o.setWorkingDays(scan.nextInt());

		return o;
	}

	// 1.3 Input daa

	public ArrayList<Employee> inputData() {
		Employee addStaff = null;
		System.out.print("Please, selecte 1 for Teacher, 2 for Empolyee: ");
		int choiceTypeStaff = scan.nextInt();
		if (choiceTypeStaff == 1) {
			addStaff = inputTeacher();
		} else
			addStaff = inputOfficer();

		list.add(addStaff);
		return list;
	}

	// 2. Menu [2]: Search & print officers and professors
	// 2.1 Search

	public ArrayList<Employee> search(String inputName) {
		searchList.clear();
		for (Employee employeeName : list) {
			if (employeeName.getName().equals(inputName) == true) {
				searchList.add(employeeName);
			}
		}

		return searchList;
	}

	// 2.2 Print
	public void printSearch() {
		if (searchList.size() == 0) {
			System.out.print("\n No employee found! \n\n");
		} else
			for (Employee employeeName : searchList) {
				System.out.println(employeeName.toString());
			}
	}

	// 3. Menu [3]: Sort & Display list of officers and professors
	// 3.1 Sort
	public void sort() {
		Collections.sort(list, new Comparator<Employee>() { // anonymous inner
			// Sort by salary
			@Override
			public int compare(Employee staff1, Employee staff2) {
				int i = 1;
				if (staff1.calculateSalary() < staff2.calculateSalary()) {
					i = -1;
					return i;
				}
				if (staff1.calculateSalary() == staff2.calculateSalary()) {
					i = 0;
					return i;
				}
				if (staff1.calculateSalary() < staff2.calculateSalary()) {
					i = 1;
					return i;
				}

				// Sort by name
				if (i == 0) {
					i = staff1.getName().compareTo(staff2.getName());
					return i;
				}
				return i;
			}
		});
	}

	// 3.2 Display
	public void printList() {
		for (Employee employee : list) {
			System.out.println(employee.toString());
		}

	}
}
