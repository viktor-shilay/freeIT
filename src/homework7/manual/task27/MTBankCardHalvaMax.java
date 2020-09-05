package homework7.manual.task27;

public class MTBankCardHalvaMax extends InstallmentCard{

    private int installmentMonths;
    private int installmentRate;


    public MTBankCardHalvaMax(String name, String number, String paymentSystem, int installmentMonths, int installmentRate) {
        super(name, number, paymentSystem);
        this.installmentMonths = installmentMonths;
        this.installmentRate = installmentRate;
    }

    public void payment(int sum){
        System.out.println("Payment " + sum + " BYN for an installment...");
    }
}
