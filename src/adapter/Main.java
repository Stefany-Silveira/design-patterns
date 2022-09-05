package adapter;

import adapter.adapters.PayoneerAdapter;
import adapter.payoneer.Payoneer;
import adapter.paypal.IPayPalPayments;
import adapter.paypal.PayPal;

public class Main {

    public static void main(String[] args) {

        //IPayPalPayments payment = new PayPal();

        IPayPalPayments payment = new PayoneerAdapter(new Payoneer());

        payment.paypalPayment();
        payment.paypalReceive();
    }
}
