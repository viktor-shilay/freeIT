package homework7.task1;

public abstract class AirTransport extends Transport{

    private double wingspan;
    private double stripLength;

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public double getStripLenght() {
        return stripLength;
    }

    public void setStripLenght(double stripLenght) {
        this.stripLength = stripLenght;
    }

}
