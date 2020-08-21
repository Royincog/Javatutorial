package Transaction;

public abstract class Tranaction {
    CreditCard transaction;

    public void paythroughCreditCard() {
        transaction.pay();
    }

    public void paythroughPaytm() {
        transaction.pay();
    }

}
