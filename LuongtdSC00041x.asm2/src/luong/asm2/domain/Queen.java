package luong.asm2.domain;

public class Queen extends Bee {
	public Queen(int health) {
		this.setHealth(health);
	}

	public boolean isDead() {
		if (this.getHealth() < 20) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Type: Queen |" +" "+"Health: "+ this.getHealth() + " " + "|" + this.isISDead();
	}
}
