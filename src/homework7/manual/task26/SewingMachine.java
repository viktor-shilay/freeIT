package homework7.manual.task26;

public class SewingMachine extends ClothingAppliance implements PowerOn {

    private String type;

    public SewingMachine(String name, int price, int issueYear, String type) {
        super(name, price, issueYear);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void turnOn() {
        System.out.println("Plugging in the sewing machine...");
    }
}
