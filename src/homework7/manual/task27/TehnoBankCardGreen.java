package homework7.manual.task27;

public class TehnoBankCardGreen extends CreditCard{

    private int creditTerm;

    public TehnoBankCardGreen(String name, String number, String paymentSystem, int creditTerm) {
        super(name, number, paymentSystem);
        this.creditTerm = creditTerm;
    }

    public void payment (int sum){
        System.out.println("Payment " + sum + " for a credit...");
    }
}
