package abstractfactory.factories;

import abstractfactory.aircrafts.IAircraft;
import abstractfactory.landvihecles.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();

}
