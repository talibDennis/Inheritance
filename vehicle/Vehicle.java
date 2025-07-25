
package vehicle;

import java.util.Random;

public abstract class Vehicle {
    private String type;
    protected Random randNum = new Random();

    public Vehicle(String type) {
        this.type = type;
    } // constructor

    // getters
    public String getType() {
        return this.type;
    } // getType()

    // setters
    public void setType(String type) {
        this.type = type;
    } // setType()

} // class