
package vehicle;

public class Bike extends Vehicle {
  private int ccSize;

  // Explicit constructor that calls Vehicle's parameterized constructor
  public Bike(String type) {
      super(type); // Calls Parent's constructor
      this.ccSize = super.randNum.nextInt(701) + 50; // 50 - 750
  } // constructor

  // getters
  public int getCCSize() {
    return this.ccSize;
  }

  // setters
  public void setCCSize(int ccSize) {
    this.ccSize = ccSize;
  }

} // class