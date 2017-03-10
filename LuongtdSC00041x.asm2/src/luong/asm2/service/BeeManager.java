package luong.asm2.service;

import java.util.ArrayList;
import java.util.Random;

import luong.asm2.domain.Bee;
import luong.asm2.domain.Drone;
import luong.asm2.domain.Queen;
import luong.asm2.domain.Worker;

public class BeeManager {
	ArrayList<Bee> bees = new ArrayList<>();

	
	/*
	 * fackeList: Radom ngau nhien 10 con ong gom : Queen, Worker, Drone Random ngau nhien
	 * => Random 3 so: 0,1,2
	 *  Neu 0 => add Queen
	 *  Neu 1 => add Worker 
	 *  Neu 2 => add Drone
	 */
	
	public void fakeList() {
		bees.clear();// Xoa du lieu lan choi trc
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			int r = random.nextInt(3);

			// add Queen
			if (r == 0) {
				Queen queen = new Queen(100);
				bees.add(queen);
			}
			
			// add Worker
			if(r==1){
				Worker worker = new Worker(100);
				bees.add(worker);
			}
			
			// add Drone
			if(r==2){
				Drone drone = new Drone(100);
				bees.add(drone);
			}
		}
	}
	
	
	// In list
	
	int i;// so thu tu
	public void printList(){	
		i =0;// de reset stt sau moi lan choi
		for (Bee bee: bees){
			i++; 
			System.out.print("No."+i+" "+"|");
			System.out.println(bee);
		}
	}
	
	// Tan cong tung con ong trong danh sach 
	
	public void damageEachBee(){
		for (Bee bee: bees){
			bee.damage();
		}
	}
}
