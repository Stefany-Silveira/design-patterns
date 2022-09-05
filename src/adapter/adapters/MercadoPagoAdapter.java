package adapter.adapters;

import adapter.mercadopago.MercadoPago;
import adapter.paypal.IPayPalPayments;
import adapter.utils.Token;

public class MercadoPagoAdapter implements IPayPalPayments {

    private Token token;
    private MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago) {
        this.mercadoPago = mercadoPago;
        System.out.println("Adaptando o MercadoPago utilizando os métodos padroes do PayPal!");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.mercadoPago.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.mercadoPago.receivePayment();
    }
}
