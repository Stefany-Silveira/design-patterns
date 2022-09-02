package factory;

import factory.vehicles.Bicycle;
import factory.vehicles.IVehicle;

public class BicycleTransport extends Transport {

    @Override
    protected IVehicle createTransport() {
        return new Bicycle();
    }
}
