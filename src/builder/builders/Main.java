package builder.builders;

import builder.cars.Car;
import builder.cars.Truck;
import builder.director.Director;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();

        //criando o carro
        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);

        Car car = builder.getresult();
        System.out.println(car.getCartype() + " produzido com sucesso!");

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);

        Truck truck = truckBuilder.getresult();
        System.out.println("Caminhaão: " + truck.result());

    }
}
