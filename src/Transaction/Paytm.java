package Transaction;

public class Paytm implements CreditCard {
        public void pay(){
            System.out.println("Paid through Paytm " + PaytmTransaction.getamount());
        }
}
