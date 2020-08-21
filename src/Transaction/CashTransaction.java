package Transaction;

public class CashTransaction extends Tranaction {
    private static int amount;
    public CashTransaction(int amount){
        this.amount = amount;
        transaction = new Bank();

    }
    public static int getamount(){
        return amount;
    }
}
