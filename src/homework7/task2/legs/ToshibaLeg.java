package homework7.task2.legs;

public class ToshibaLeg implements ILeg{
    private int price;

    public ToshibaLeg(int price){
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Нога Toshiba идет...");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
