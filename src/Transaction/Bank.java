package Transaction;

public class Bank implements CreditCard {

    @Override
    public void pay() {
        System.out.println("Amount paid through bank is " + CashTransaction.getamount());
        //contain bank methods to pay
    }
   /* public Bank(int accountNumber){
        this.accountNumber = accountNumber;
    }*/ //for future reusabilty
}

