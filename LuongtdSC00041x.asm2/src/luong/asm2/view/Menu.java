package luong.asm2.view;


import java.util.Scanner;
import luong.asm2.service.BeeManager;

public class Menu {

	// In Menu

	 void printMenu() {
		System.out.println("1- Generate bee list");
		System.out.println("2- Attack bee");
		System.out.println("3- Exit");
		System.out.print("Select 1,2,3: ");
	}

	public Menu() {
		// Tao Oject moi
		BeeManager beeManager = new BeeManager();
		int choice = 0;
		do {
			printMenu();
			Scanner scanner = new Scanner(System.in);
			choice = scanner.nextInt();
			switch (choice) {
				case 1:// Tao danh sach ngau nhien 10 con ong
					beeManager.fakeList();
					beeManager.printList();
					break;
				case 2: // Tan cong tung con ong 
					beeManager.damageEachBee();
					beeManager.printList();
					break;
				case 3:
					System.exit(0);
				default:
					System.out.println("Error! Please, try again.");
					break;
			}
		} while (choice != 3);
	}
	
public static void main(String[] args) {
	    new Menu();
	  }

}
