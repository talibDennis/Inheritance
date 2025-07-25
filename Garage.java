
import vehicle.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Garage {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Car> cars = new ArrayList<Car>();
    private static ArrayList<Bike> bikes = new ArrayList<Bike>();

    public static void main(String[] args) {

        System.out.print("How many vehicles in the garage? ");
        int vehicleCount = input.nextInt();

        // loop for vehicle creation
        for(int i = 0; i <vehicleCount; i++) {
            System.out.print("1) New Car 2) New Bike ");
            int type = input.nextInt();

            if(type == 1) { // car
                Car car = new Car("Car"); // creates a new car
                cars.add(car);
            }
            else { // bike
                Bike bike = new Bike("Bike"); // creates a new car
                bikes.add(bike);
            }
        } // for

        // printing vehicle details
        // print car
        for(int i = 0; i < cars.size(); i++) {
            System.out.printf("Type: %s Trunk Cap: %d (cubic feet)%n", cars.get(i).getType(), cars.get(i).getTrunkCapacity());
        } // car for

        // print bikes
        for(int i = 0; i < bikes.size(); i++) {
            System.out.printf("type: %s Engine Size: %dcc%n", bikes.get(i).getType(), bikes.get(i).getCCSize());
        } // bike for

        input.close();

    } // main

} // class