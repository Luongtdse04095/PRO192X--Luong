package luong.asm2.domain;

import java.util.Random;

public abstract class Bee {
	private int health;

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	// Xac dinh trang thai song chet cua Ong
	
	abstract public boolean isDead();
	
	public String isISDead(){
		if(isDead()==true){
			return "Dead";
		}
		return "Live";
	}

	// Do giam cua suc khoe

	public void damage() {
		if (isDead()==false) {// neu chua chet thi se tru suc khoe
			Random random = new Random();
			int r = random.nextInt(101);
			this.health -= r;
		}
	}

	@Override
	public abstract String toString();
}
