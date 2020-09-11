package homework7.task1;

public abstract class GroundTransport extends Transport {

    private int wheels;
    private double fuelConsuption;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getFuelConsuption() {
        return fuelConsuption;
    }

    public void setFuelConsuption(double fuelConsuption) {
        this.fuelConsuption = fuelConsuption;
    }

}
