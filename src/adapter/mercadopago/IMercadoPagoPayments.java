package adapter.mercadopago;

import adapter.utils.Token;

public interface IMercadoPagoPayments {

    Token authToken();
    void sendPayment();
    void receivePayment();
}

