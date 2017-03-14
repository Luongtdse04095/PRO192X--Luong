package service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import domain.Professor;
import util.NumberUtil;
import domain.Employee;
import domain.Officer;

public class StaffManager {

	ArrayList<Employee> list = new ArrayList<>();
	ArrayList<Employee> searchList = new ArrayList<>();
	Scanner scan = new Scanner(System.in);

	// 1. Menu [1]: Enter staffs’ information
	// 1.1 Input Teacher

	Professor inputTeacher() {
		Professor t = new Professor();

		// Set teacher's name

		System.out.print("Name: ");
		scan.nextLine();// It consumes the \n character of nextInt() method
						// Source: http://stackoverflow.com
		t.setName(scan.nextLine());

		// Set teacher's salary radio

		boolean flagCheckTearcherSalaryRadio = false;
		String enterStrTearcherSalaryRadio = null;

		do {
			System.out.print("Ratio Salary: ");

			enterStrTearcherSalaryRadio = scan.next();

			flagCheckTearcherSalaryRadio = NumberUtil.checkInteger(enterStrTearcherSalaryRadio);

		} while (!flagCheckTearcherSalaryRadio);

		int enterTearcherSalaryRadio = Integer.parseInt(enterStrTearcherSalaryRadio);

		t.setSalaryRadio(enterTearcherSalaryRadio);

		// Set teacher's falcuty

		System.out.print("Falcuty: ");
		scan.nextLine();
		t.setFalcuty(scan.nextLine());

		// Set teacher's degree

		String enterStrTearcherDegree = null;

		boolean flagTryCheckTearcherDegree = true;

		do {
			System.out.print("Degree (1= Bacherlor, 2= Master, 3= Doctor): ");

			enterStrTearcherDegree = scan.next();

			flagTryCheckTearcherDegree = NumberUtil.checkDigit(enterStrTearcherDegree);

		} while (flagTryCheckTearcherDegree == false);

		int enterTearcherDegree = Integer.parseInt(enterStrTearcherDegree);

		t.setDegree(enterTearcherDegree);

		// Set teacher's working time

		boolean flagCheckTearcherWorkingTime = false;
		String enterStrTearcherWorkingTime = null;

		do {
			System.out.print("Working time: ");

			enterStrTearcherWorkingTime = scan.next();

			flagCheckTearcherWorkingTime = NumberUtil.checkInteger(enterStrTearcherWorkingTime);

		} while (!flagCheckTearcherWorkingTime);

		int enterTearcherWorkingTime = Integer.parseInt(enterStrTearcherWorkingTime);

		t.setTeachingTime(enterTearcherWorkingTime);

		return t;
	}

	// 1.2 Input Officer

	Officer inputOfficer() {

		Officer o = new Officer();

		// Set Officer's name
		System.out.print("Name: ");
		scan.nextLine();
		o.setName(scan.nextLine());

		// Set Officer's Salary Radio

		boolean flagCheckOfficerSalaryRadio = false;
		String enterStrOfficerSalaryRadio = null;

		do {
			System.out.print("Salary Ratio: ");

			enterStrOfficerSalaryRadio = scan.next();

			flagCheckOfficerSalaryRadio = NumberUtil.checkInteger(enterStrOfficerSalaryRadio);

		} while (!flagCheckOfficerSalaryRadio);

		int enterOfficerSalaryRadio = Integer.parseInt(enterStrOfficerSalaryRadio);

		o.setSalaryRadio(enterOfficerSalaryRadio);

		// Set Officer's Department

		System.out.print("Department: ");
		scan.nextLine();
		o.setDepartment(scan.nextLine());

		// Set Officer's Position

		String enterStrOfficerPosition = null;

		boolean flagTryCheckOfficerPosition = true;

		do {
			System.out.print("Position (1=Department Head, 2=Voice head, 3= Staff ): ");

			enterStrOfficerPosition = scan.next();

			flagTryCheckOfficerPosition = NumberUtil.checkDigit(enterStrOfficerPosition);

		} while (flagTryCheckOfficerPosition == false);

		int enterOfficerPosition = Integer.parseInt(enterStrOfficerPosition);

		o.setPosition(enterOfficerPosition);

		// Set Officer's Working day

		boolean flagCheckOfficerWorkingDay = false;
		String enterStrOfficerWorkingDay = null;

		do {
			System.out.print("Working days: ");

			enterStrOfficerWorkingDay = scan.next();

			flagCheckOfficerWorkingDay = NumberUtil.checkInteger(enterStrOfficerWorkingDay);

		} while (!flagCheckOfficerWorkingDay);

		int enterOfficerWorkingDay = Integer.parseInt(enterStrOfficerWorkingDay);

		o.setWorkingDays(enterOfficerWorkingDay);

		return o;
	}

	// 1.3 Input data

	public ArrayList<Employee> inputData() {
		Employee addStaff = null;
		boolean flag = false;
		String enter = null;

		do {
			System.out.print("Please, selecte 1 for Professor, 2 for Officer: ");

			enter = scan.next();

			flag = NumberUtil.checkChoice(enter);

		} while (!flag);

		int choiceTypeStaff = Integer.parseInt(enter);
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

	// 2.2 Print Searched List
	public void printSearch() {
		if (searchList.size() == 0) {
			System.out.print("\n No employee found! \n\n");
		} else
			for (Employee employeeName : searchList) {
				System.out.println("\r" + employeeName.toString());
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
					int sortName = staff1.getName().compareTo(staff2.getName());
					return sortName;
				} else
					return i;
			}
		});
	}

	// 3.2 Display

	public void printList() {
		for (Employee employee : list) {
			System.out.println("\r" + employee.toString());
		}

	}

	//////////
	public void saveToFile() {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("employee.dat", true));
			out.writeObject(list);
		} catch (Exception ex) {
			Logger.getLogger(StaffManager.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public ArrayList<Employee> readFromFile() {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("employee.dat"));
			ArrayList<Employee> list = (ArrayList<Employee>) in.readObject();
			return list;

		} catch (Exception ex) {
			// out 1 message
			ex.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return null;
	}
	// public ArrayList<Employee> readFromFile() {
	// try {
	// File file = new File("employee.txt");
	// FileInputStream fileInputStream = new FileInputStream(file);
	// ObjectInputStream inStream = new ObjectInputStream(fileInputStream);
	// Object object;
	// while (true) {
	// object = inStream.readObject();
	// list.add((Employee) object);
	// }
	// } catch (ClassNotFoundException e) {
	// } catch (IOException e) {
	// }
	// return list;
	// }
}