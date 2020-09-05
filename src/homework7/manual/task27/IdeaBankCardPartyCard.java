package homework7.manual.task27;

public class IdeaBankCardPartyCard extends DebitCard {

    private int discountInStores;

    public IdeaBankCardPartyCard(String name, String number, String paymentSystem, int discountInStores) {
        super(name, number, paymentSystem);
        this.discountInStores = discountInStores;
    }

    public void payment (int sum){
        System.out.println("Payment " + sum + " BYN for a product...");
    }
}
