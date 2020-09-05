package homework7.manual.task26;

public class Dishwasher extends LargeAppliance implements PowerOn{

    private int quantityProgram;

    public Dishwasher(String name, int price, int issueYear, int quantityProgram) {
        super(name, price, issueYear);
        this.quantityProgram = quantityProgram;
    }

    public int getQuantityProgram() {
        return quantityProgram;
    }

    public void setQuantityProgram(int quantityProgram) {
        this.quantityProgram = quantityProgram;
    }

    @Override
    public void turnOn() {
        System.out.println("Plugging in the dishwasher...");
    }
}
