package luong.asm2.bee;

public class Queen extends Bee {

	  public Queen(int health) {
	    this.setHealth(health);
	  }
	  
	  /**
	   * camelCase
	   * @return 
	   */
	  
	  public boolean isIsDeath() {
	    if(this.getHealth() < 20){
	      return true;
	    }
	    
	    return false;
	  } 
	  
	  @Override
	  public String toString() {
	    return "Queen|"+getHealth()+"|"+isIsDeath();
	  }  
	  
	}