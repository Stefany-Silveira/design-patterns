package solid.isp;

import solid.isp.vehicles.Car;
import solid.isp.vehicles.Motorcycle;

public class Main {

    private static String type;

    public static void main(String[] args) {

        type = "Car";
        if (type == "Car") {
            Car car = new Car("Azul", "2022", 2.6, 4);
        } else {
            Motorcycle motorcycle = new Motorcycle("Branca", "2022", 250);
        }
    }
}
