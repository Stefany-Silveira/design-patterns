package abstractfactory;

import abstractfactory.app.Application;
import abstractfactory.factories.ITransportFactory;
import abstractfactory.factories.NineNineTransport;
import abstractfactory.factories.UberTransport;

public class Main {

    public static Application configureApplication() {
        Application app;
        ITransportFactory factory;

        String company = "uber";

        if (company == "99") {
            factory= new UberTransport();
        } else {
            factory = new NineNineTransport();
        }
        app = new Application(factory);

        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.startRoute();
    }
}
