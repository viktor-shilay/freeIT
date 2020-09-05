package homework7.manual.task27;

public abstract class DebitCard extends BankCard {
    private int cashBack;

    public DebitCard(String name, String number, String paymentSystem) {
        super(name, number, paymentSystem);
    }
}
