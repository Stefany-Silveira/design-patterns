package factory;

import factory.vehicles.Car;
import factory.vehicles.IVehicle;

public class CarTransport extends Transport {

    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
