package homework7.task2.hands;

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand(int price){
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Рука Samsung поднимается...");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
