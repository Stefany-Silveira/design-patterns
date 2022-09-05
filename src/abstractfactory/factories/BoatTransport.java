package abstractfactory.factories;

import abstractfactory.aircrafts.Airplane;
import abstractfactory.aircrafts.IAircraft;
import abstractfactory.boats.Boat;
import abstractfactory.boats.IBoat;
import abstractfactory.landvihecles.Car;
import abstractfactory.landvihecles.ILandVehicle;

public class BoatTransport implements ITransportFactory {

    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }

    @Override
    public IBoat createTransportBoat() {
        return new Boat();
    }
}
