package luong.asm2.bee;
import java.util.Scanner;
public class Menu {

	void printMenu() {
	    System.out.println("1- Generate bee list");
	    System.out.println("2- Attack bee");
	    System.out.println("3- Exit");

	    System.out.print("Select 1,2,3: "); //ba  
	  }

	  public Menu() {
	    //1 - create bee 
	    BeeManager beemanager = new BeeManager();
	    int choice = 0;

	    //print menu
	    //1st try printmenu
	    //2nd -> menu again
	    do {
	      printMenu();
	      Scanner scanner = new Scanner(System.in);
	      choice = scanner.nextInt();

	      switch (choice) {
	        case 1:
	          beemanager.fakeList(10);
	          beemanager.printList();
	          break;
	        case 2:
	          beemanager.damageEachBee();
	          beemanager.printList();

	          break;
	        case 3:
	          System.exit(0);

	        default:
	          System.out.println("Ngu the. Tao chua kip lam so >3");
	          //in menu
	          break;
	      }
	    } while (choice != 3);

	  }
	  public static void main(String[] args) {
	    new Menu();
	  }
}
