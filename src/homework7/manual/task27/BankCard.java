package homework7.manual.task27;

public abstract class BankCard {
    private String name;
    private String number;
    private String paymentSystem;

    public BankCard(String name, String number, String paymentSystem) {
        this.name = name;
        this.number = number;
        this.paymentSystem = paymentSystem;
    }
}
