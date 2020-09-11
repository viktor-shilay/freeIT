package homework7.task1;

public class PassengerTransport extends GroundTransport {

    private String bodyType;
    private int numberOfPassengers;

    private double km;
    private double fuel;

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String printParameters(){
        return "Model: " + getModel()+ "\nPower (h.p.): " + getPower() + "\nPower (kW): " + getKilowatt()+ "\nmaxSpeed: " +getMaxSpeed()+ "\nWeight: "+ getWeight()+ "\nConsuption: "+ getFuelConsuption()+ "\nNumber of wheels: "+ getWheels()
                +"\nBody Type: "+ this.bodyType + "\nPassengers Number: "+ this.numberOfPassengers+"\n";
    }

    public void result(double hours){
        calculate(hours);
        System.out.println("За время "+hours+" ч, автомобиль "+ getModel()+ " двигаясь с максимальной скоростью "+ getMaxSpeed()+ " проедет " + km + " км и израсходует "+ fuel + " литров топлива.\n");
    }
    private void calculate(double hours){
        km = hours*getMaxSpeed();
        fuel = km*getFuelConsuption()/100;
    }
}
