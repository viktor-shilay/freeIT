package homework7.manual.task26;

public class Oven extends BuildInAppliance implements PowerOn {

    private int modeQuantity;
    private int volume;

    public Oven(String name, int price, int issueYear, int modeQuantity, int volume) {
        super(name, price, issueYear);
        this.modeQuantity = modeQuantity;
        this.volume = volume;
    }

    public int getModeQuantity() {
        return modeQuantity;
    }

    public void setModeQuantity(int modeQuantity) {
        this.modeQuantity = modeQuantity;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void turnOn() {
        System.out.println("Plugging in the oven...");
    }
}
