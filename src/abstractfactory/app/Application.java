package abstractfactory.app;

import abstractfactory.aircrafts.IAircraft;
import abstractfactory.factories.ITransportFactory;
import abstractfactory.landvihecles.ILandVehicle;

public class Application {

    private ILandVehicle vehicle;
    private IAircraft aircraft;

    public Application(ITransportFactory factory) {
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
    }

    public void startRoute() {
        vehicle.startRoute();
        aircraft.startRoute();
    }
}
