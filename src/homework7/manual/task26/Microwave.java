package homework7.manual.task26;

public class Microwave extends BuildInAppliance implements PowerOn {

    private int volume;

    public Microwave(String name, int price, int issueYear, int volume) {
        super(name, price, issueYear);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void turnOn() {
        System.out.println("Plugging in the microwave...");
    }
}
