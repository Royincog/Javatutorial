package Transaction;

public class CashTransaction extends Tranaction {
    private static int amount;

    public CashTransaction(int amount) {
        this.amount = amount;
        transaction = new Bank();


    }

    @Override
    public void paythroughPaytm() {
       transaction = new Paytm();
    }

    public static int getamount() {
        return amount;
    }
}
