package homework7.task3.pants;

public class Pants implements IPants {
    private int size;

    public Pants(int size) {
        this.size = size;
    }

    @Override
    public void putOn() {
        System.out.println("Putting on the pantsr...");
    }

    @Override
    public void putOff() {
        System.out.println("Putting off the pants...");
    }

    @Override
    public String toString() {
        return "Pants (size = " + size + ")";
    }
}
