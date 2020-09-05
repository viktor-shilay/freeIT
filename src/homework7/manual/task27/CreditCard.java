package homework7.manual.task27;

public abstract class CreditCard extends BankCard {

    private int interestRate;


    public CreditCard(String name, String number, String paymentSystem) {
        super(name, number, paymentSystem);
    }
}
