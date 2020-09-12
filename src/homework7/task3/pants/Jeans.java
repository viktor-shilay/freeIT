package homework7.task3.pants;

public class Jeans implements IPants {
    private int size;

    public Jeans(int size) {
        this.size = size;
    }

    @Override
    public void putOn() {
        System.out.println("Putting on the jeans...");
    }

    @Override
    public void putOff() {
        System.out.println("Putting off the jeans...");
    }

    @Override
    public String toString() {
        return "Jeans (size = " + size + ")";
    }
}
