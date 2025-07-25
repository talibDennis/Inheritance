
package vehicle;

public class Car extends Vehicle {
  private int trunkCapacity;

  // Explicit constructor that calls Vehicle's parameterized constructor
  public Car(String type) {
      super(type); // Calls Parent's constructor
      this.trunkCapacity = super.randNum.nextInt(31) + 15; // 15 - 45
  } // constructor

  // getters
  public int getTrunkCapacity() {
    return this.trunkCapacity;
  }

  // setters
  public void setTrunkCapacity(int trunkCapacity) {
    this.trunkCapacity = trunkCapacity;
  }

} // class