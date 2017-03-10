package domain;

public class Officer extends Employee  {
	private String department;
	  
	  int position;//0 = bachelor, 1: master, 2: doctor
	  
	  public static int POSITION_STAFF = 0;
	  public static int POSITION_VICE = 1;
	  public static int POSITION_HEAD = 2;
	  
	  int workingTime;
	  

	  public  int getAllowance() {
	    if(position == POSITION_STAFF) {
	      return 500;
	    } else if(position == POSITION_VICE){
	      return 1000;
	    } else {
	      return 2000;
	    }
	  }

	@Override
	  public  double calculateSalary() {
	    return salaryRatio*730 + getAllowance() + workingime*30;
	  }

	  @Override
	  public String toString() {
	    return "Officer{" + "name=" + name + ", salary=" + calculateSalary();
	  }
	  
}