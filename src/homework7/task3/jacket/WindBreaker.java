package homework7.task3.jacket;

public class WindBreaker implements IJacket {
    private int size;

    public WindBreaker(int size) {
        this.size = size;
    }

    @Override
    public void putOn() {
        System.out.println("Putting on the windbreaker...");
    }

    @Override
    public void putOff() {
        System.out.println("Putting off the windbreaker...");
    }

    @Override
    public String toString() {
        return "Windbreaker (size = " + size + ")";
    }
}
