package factory;

import factory.vehicles.IVehicle;

public abstract class Transport {

    void startTransport() {
        IVehicle vehicles = createTransport();
        vehicles.startRoute();
    }

    protected abstract IVehicle createTransport();
}
