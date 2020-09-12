package homework7.task2.heads;

public class ToshibaHead implements IHead {
    private int price;

    public ToshibaHead() {
    }

    public ToshibaHead(int price) {
        this.price = price;
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Toshiba...");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
