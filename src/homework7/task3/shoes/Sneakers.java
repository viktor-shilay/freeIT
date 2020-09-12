package homework7.task3.shoes;

public class Sneakers implements IShoes {
    private int size;

    public Sneakers(int size) {
        this.size = size;
    }

    @Override
    public void putOn() {
        System.out.println("Putting on the sneakers...");
    }

    @Override
    public void putOff() {
        System.out.println("Putting off the sneakers...");
    }

    @Override
    public String toString() {
        return "Sneakers (size = " + size + ")";
    }
}
