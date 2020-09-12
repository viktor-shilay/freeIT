package homework7.task2.heads;

public class SamsungHead implements IHead {
    private int price;

    public SamsungHead(){

    }
    public SamsungHead (int price){
        this.price = price;
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Samsung...");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
