package domain;

public class Teacher extends Employee implements IEmployee {
	// 1. Ho ten
	// 2. Khoa

	private String falcuty;

	public String getFalcuty() {
		return falcuty;
	}

	public void setFalcuty(String falcuty) {
		this.falcuty = falcuty;
	}

	// 3. Trinh do

	public int degree;// 0 = bachelor, 1: master, 2: doctor

	public String isDegree() {
		if (degree == 0)
			return "Bachelor";
		if (degree == 1)
			return "Master";
		return "Doctor";
	}

	// 4. Phu cap

	@Override
	public int getAllowance() {
		if (degree == 1) {
			return 300;
		} else if (degree == 2) {
			return 500;
		} else {
			return 1000;
		}
	}

	// 5. Thoi gian giang day

	private int teachingTime;

	public int getTeachingTime() {
		return teachingTime;
	}

	public void setTeachingTime(int teachingTime) {
		this.teachingTime = teachingTime;
	}

	// 6. Luong
	@Override
	public double calculateSalary() {
		return 730 * salaryRatio + getAllowance() + teachingTime * 45;
	}

	@Override
	public String toString() {
		return "Teacher{" + "name=" + name + ", salary=" + this.calculateSalary();
	}
}
