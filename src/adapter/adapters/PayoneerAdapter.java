package adapter.adapters;

import adapter.payoneer.Payoneer;
import adapter.paypal.IPayPalPayments;
import adapter.utils.Token;

public class PayoneerAdapter implements IPayPalPayments {

    private Token token;
    private Payoneer payoneer;

    public PayoneerAdapter(Payoneer payoneer) {
        this.payoneer = payoneer;
        System.out.println("Adaptando o Payoneer utilizando os métodos padroes do PayPal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.payoneer.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.payoneer.receivePayment();
    }
}
