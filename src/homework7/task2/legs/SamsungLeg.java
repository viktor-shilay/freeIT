package homework7.task2.legs;

public class SamsungLeg implements ILeg{
    private int price;

    public SamsungLeg(int price){
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Нога Samsung идет...");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
