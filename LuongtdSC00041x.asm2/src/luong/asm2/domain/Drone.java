package luong.asm2.domain;

public class Drone extends Bee {
	public Drone(int health) {
		this.setHealth(health);
	}

	public boolean isDead() {
		if (this.getHealth() < 50) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Type: Drone |" +" "+"Health: "+ this.getHealth() + " " + "|" + this.isISDead();
	}
}
