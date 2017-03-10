package luong.asm2.bee;

public class Worker extends Bee {
	  
	  public Worker(int health) {
	    this.setHealth(health);
	  }
	  
	  public boolean isIsDeath() {
	    if(this.getHealth() < 70){
	      return true;
	    }
	    
	    return false;
	  }   
	  
	  @Override
	  public String toString() {
	    return "Worker|"+getHealth()+"|"+isIsDeath();
	  }
	}