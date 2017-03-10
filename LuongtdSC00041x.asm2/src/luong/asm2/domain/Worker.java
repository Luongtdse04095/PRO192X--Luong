package luong.asm2.domain;

public class Worker extends Bee {
	public Worker(int health) {
		this.setHealth(health);
	}

	public boolean isDead() {
		if (this.getHealth() < 70) {
			return true;
		}
		return false;
	}
	@Override
	public String toString(){
		return "Type: Worker |" +" "+"Health: "+ this.getHealth() + " " + "|" + this.isISDead();
	}
}
