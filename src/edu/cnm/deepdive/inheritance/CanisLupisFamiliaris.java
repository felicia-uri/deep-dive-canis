package edu.cnm.deepdive.inheritance;

public class CanisLupisFamiliaris extends CanisLupis {
  
  private boolean goodBoy;

  public CanisLupisFamiliaris(String name, int weight, boolean goodBoy) {
    super(name, weight);
    this.goodBoy = goodBoy;
  
  }

  public CanisLupisFamiliaris(String name, int weight) {
    this(name, weight, true);

  }

  /**
   * @return the goodBoy
   */
  public boolean isGoodBoy() {
    return goodBoy;
  }

  /**
   * @param goodBoy the goodBoy to set
   */
  public void setGoodBoy(boolean goodBoy) {
    this.goodBoy = goodBoy;
  }

  /* (non-Javadoc)
   * @see edu.cnm.deepdive.inheritance.CanisLupis#speak()
   */
  @Override
  public void speak() {
   System.out.println(getName() + ": bark!");
  }

  /* (non-Javadoc)
   * @see edu.cnm.deepdive.inheritance.Canis#hunt()
   */
  @Override
  public void hunt() {
    System.out.println("Beg for food");
  }

}
