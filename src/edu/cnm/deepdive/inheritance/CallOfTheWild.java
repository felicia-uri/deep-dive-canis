package edu.cnm.deepdive.inheritance;

public class CallOfTheWild {

  private CallOfTheWild( ) {
  }
  public static void main(String[] args) {
    Canis dogA = new CanisLupis("Buck", 175);
    Canis dogB = new CanisLupisFamiliaris("Fido", 75);
    dogA.hunt();
    dogB.hunt();
    ((CanisLupis) dogA).speak();
    ((CanisLupis) dogB).speak();
  }

}
