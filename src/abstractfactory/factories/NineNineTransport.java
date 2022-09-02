package abstractfactory.factories;

import abstractfactory.aircrafts.Helicopter;
import abstractfactory.aircrafts.IAircraft;
import abstractfactory.landvihecles.ILandVehicle;
import abstractfactory.landvihecles.Motorcycle;

public class NineNineTransport implements ITransportFactory {

    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }
}
