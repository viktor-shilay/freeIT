package homework7.task3.shoes;

public class Shoes implements IShoes {
    private int size;

    public Shoes(int size) {
        this.size = size;
    }

    @Override
    public void putOn() {
        System.out.println("Putting on the shoes...");
    }

    @Override
    public void putOff() {
        System.out.println("Putting off the shoes...");
    }

    @Override
    public String toString() {
        return "Shoes (size = " + size + ")";
    }
}
