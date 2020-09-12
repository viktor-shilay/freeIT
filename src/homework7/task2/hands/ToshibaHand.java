package homework7.task2.hands;

public class ToshibaHand implements IHand{
    private int price;

    public ToshibaHand(int price){
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Рука Toshiba поднимается...");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
