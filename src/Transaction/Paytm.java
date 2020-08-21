package Transaction;

public class Paytm extends Bank{
    @Override
    public void pay() {
        System.out.println("Paid through Paytm " + CashTransaction.getamount());
    }
}
