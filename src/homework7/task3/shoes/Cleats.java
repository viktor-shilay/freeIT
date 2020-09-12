package homework7.task3.shoes;

public class Cleats implements IShoes {
    private int size;

    public Cleats(int size) {
        this.size = size;
    }

    @Override
    public void putOn() {
        System.out.println("Putting on the cleats...");
    }

    @Override
    public void putOff() {
        System.out.println("Putting off the cleats...");
    }

    @Override
    public String toString() {
        return "Cleats (size = " + size + ")";
    }
}
