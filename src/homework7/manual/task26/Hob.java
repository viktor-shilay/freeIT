package homework7.manual.task26;

public class Hob extends BuildInAppliance implements PowerOn {

    private int burnersNumber;
    private int power;

    public Hob(String name, int price, int issueYear, int burnersNumber, int power) {
        super(name, price, issueYear);
        this.burnersNumber = burnersNumber;
        this.power = power;
    }

    public int getBurnersNumber() {
        return burnersNumber;
    }

    public void setBurnersNumber(int burnersNumber) {
        this.burnersNumber = burnersNumber;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void turnOn() {
        System.out.println("Plugging in the hob...");
    }
}
