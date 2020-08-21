package Transaction;

public class PaymentGateway {
    public static void main(String[] args) {
        CashTransaction transaction = new CashTransaction(23);
        PaytmTransaction transaction1 = new PaytmTransaction(45);
        transaction1.paythroughPaytm();
        transaction.paythroughCreditCard();


    }
}
