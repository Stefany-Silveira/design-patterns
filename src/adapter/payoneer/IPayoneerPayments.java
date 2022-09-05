package adapter.payoneer;

import adapter.utils.Token;

public interface IPayoneerPayments {

    Token authToken();
    void sendPayment();
    void receivePayment();
}
