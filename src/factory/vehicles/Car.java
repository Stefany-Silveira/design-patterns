package factory.vehicles;

public class Car implements IVehicle {

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Inciando o trajeto!");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos os passageiros!");
    }
}
