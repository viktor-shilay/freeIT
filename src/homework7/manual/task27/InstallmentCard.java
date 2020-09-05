package homework7.manual.task27;

public abstract class InstallmentCard extends BankCard{
    private int installmentAmount;

    public InstallmentCard(String name, String number, String paymentSystem) {
        super(name, number, paymentSystem);
    }
}
