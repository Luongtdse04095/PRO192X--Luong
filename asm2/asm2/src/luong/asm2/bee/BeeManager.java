package luong.asm2.bee;
import java.util.ArrayList;
import java.util.Random;
public class BeeManager {
	ArrayList<Bee> bees = new ArrayList<>();
	  Random random = new Random();
	  
	  public void fakeList(int n){
	    //queen
	    int r1 = 1 + random.nextInt(n/4);
	    for (int i = 0; i < r1; i++) {
	      Queen queen = new Queen(100);
	      bees.add(queen);
	    }
	    
	    //drone
	    int r2 = 2 + random.nextInt(n/2);
	    for (int i = 0; i < r2; i++) {
	      Drone drone = new Drone(100);
	      bees.add(drone);
	    }
	    
	    //worker
	    int r3 = n - r1 - r2;
	    for (int i = 0; i < r2; i++) {
	      Worker worker = new Worker(100);
	      bees.add(worker);
	    }
	  }
	  int i =1;
	  public void printList(){
	   for (Bee bee : bees) {
		  System.out.print(i++ +" ");
	      System.out.println(bee);
	    }
	  }
	  
	  public void damageEachBee(){
	    for (Bee bee : bees) {
	      bee.damage();
	    }
	  }
}
