package homework7.manual.task26;

public class Steamer extends ClothingAppliance implements PowerOn {

    private int power;

    public Steamer(String name, int price, int issueYear, int power) {
        super(name, price, issueYear);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void turnOn() {
        System.out.println("Plugging in the steamer...");
    }
}
