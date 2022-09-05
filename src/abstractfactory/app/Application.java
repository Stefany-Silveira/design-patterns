package abstractfactory.app;

import abstractfactory.aircrafts.IAircraft;
import abstractfactory.boats.IBoat;
import abstractfactory.factories.ITransportFactory;
import abstractfactory.landvihecles.ILandVehicle;

public class Application {

    private ILandVehicle vehicle;
    private IAircraft aircraft;

    private IBoat boat;

    public Application(ITransportFactory factory) {
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
        boat = factory.createTransportBoat();
    }

    public void startRoute() {
        vehicle.startRoute();
        aircraft.startRoute();
        boat.startRoute();
    }
}
