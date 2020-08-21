package Transaction;

public class PaytmTransaction extends Tranaction{
    private static int amount;
    public PaytmTransaction(int amount){
        this.amount = amount;
        transaction = new Paytm();

    }
    public static int getamount(){
        return amount;
    }
}

