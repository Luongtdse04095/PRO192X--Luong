package luong.asm2.bee;
public class Drone extends Bee {
  
  public Drone(int health) {
    this.setHealth(health);
  }
  
  
  public boolean isIsDeath() {
    if(this.getHealth() < 50){
      return true;
    }
    
    return false;
  }   
  
  @Override
  public String toString() {
    return "Drone|"+" "+ " Health: " + getHealth()+" "+"|"+" "+ ;
  }
}