package homework7.manual.task26;

public class WashMachine extends LargeAppliance implements PowerOn{

    private int capacity;

    public WashMachine(String name, int price, int issueYear, int capacity) {
        super(name, price, issueYear);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void turnOn() {
        System.out.println("Plugging in the washmashine...");
    }
}
