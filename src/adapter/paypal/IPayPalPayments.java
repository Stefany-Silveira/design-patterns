package adapter.paypal;

import adapter.utils.Token;

public interface IPayPalPayments {

    Token authToken();
    void paypalPayment();
    void paypalReceive();
}
