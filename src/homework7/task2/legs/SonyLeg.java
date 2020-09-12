package homework7.task2.legs;

public class SonyLeg implements ILeg{
    private int price;

    public SonyLeg(int price){
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Нога Sony идет...");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
