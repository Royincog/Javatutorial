package Transaction;

public class PaymentGateway {
    public static void main(String[] args) {
        CashTransaction transaction = new CashTransaction(23);

        transaction.paythroughPaytm();
        transaction.paythroughCreditCard();


    }
}
