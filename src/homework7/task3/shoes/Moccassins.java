package homework7.task3.shoes;

public class Moccassins implements IShoes {

    private int size;

    public Moccassins(int size) {
        this.size = size;
    }

    @Override
    public void putOn() {
        System.out.println("Putting on the moccassins...");
    }

    @Override
    public void putOff() {
        System.out.println("Putting off the moccassins...");
    }

    @Override
    public String toString() {
        return "Moccassins (size = " + size + ")";
    }
}
