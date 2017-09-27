package edu.cnm.deepdive.inheritance;

public class CanisLupis extends Canis {

  public CanisLupis(String name, int weight) {
    super(name, weight);
    // TODO Auto-generated constructor stub
  }
  
  public void speak( ) {
    System.out.println(getName() + ": howl!"); 
  }

}
