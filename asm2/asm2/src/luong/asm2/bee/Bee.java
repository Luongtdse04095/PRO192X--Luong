package luong.asm2.bee;
import java.util.Random;
public abstract  class Bee {
		
		
		  
		  private float health;
	
		  public float getHealth() {
		    return health;
		  }

		  public void setHealth(float health) {
		    this.health = health;
		  }

		  abstract public boolean isIsDeath();
		  
		  public String is

		  public void damage(){
			Random random = new Random();
		    int r = random.nextInt(81); //Boi vi chi tru khi Bee ko chet 
		    float delta = this.health*r/100;
		    if(!isIsDeath()){
		      this.health -= delta;
		    }
		  }

		  @Override
		  abstract public String toString();
}
