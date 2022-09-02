package factory;

import factory.vehicles.IVehicle;
import factory.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport {

    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
