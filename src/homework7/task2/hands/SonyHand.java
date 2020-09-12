package homework7.task2.hands;

public class SonyHand implements IHand{
    private int price;

    public SonyHand(int price){
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Рука Sony поднимается...");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
