package solid.ocp.vehicles;

public class Car implements IVehicleCar {

    private String color;
    private String year;
    private double engine;
    private int seats;


    public Car(String color, String year, double engine, int seats) {
        configureVehicle(color, year, engine, seats);
    }

    public void configureVehicle(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;

        System.out.println("Criando um carro com Interface: " +
                "COR: " + color + " - " +  " MOTOR: " + engine);
        startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("Ligando os Motores com Interface");
    }
}
