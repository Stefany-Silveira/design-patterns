package abstractfactory.factories;

import abstractfactory.aircrafts.Airplane;
import abstractfactory.aircrafts.IAircraft;
import abstractfactory.landvihecles.Car;
import abstractfactory.landvihecles.ILandVehicle;

public class UberTransport implements ITransportFactory {

    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}
