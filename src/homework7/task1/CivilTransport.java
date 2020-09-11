package homework7.task1;

import java.util.Scanner;

public class CivilTransport extends AirTransport{

    private int numberOfPassengers;
    private boolean businessClass;

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    @Override
    public String printParameters(){
        return "Model: " + getModel()+ "\nWeight: "+ getWeight()+ "\nmaxSpeed: " +getMaxSpeed()+ "\nPower (h.p.): " + getPower() + "\nPower (kW): " + getKilowatt()+ "\nStrip lenght: "+ getStripLenght()+ "\nWingspan: "+ getWingspan()
                +"\nNumber of passengers: " + this.numberOfPassengers+ "\nBusiness class: "+ this.businessClass + "\n";

    }

    public void result(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Кол-во пассажиров, которых необходимо загрузить:");
        int capacity = myScanner.nextInt();
        if (capacity<this.numberOfPassengers){
            System.out.println("Самолет загружен");
        }else System.out.println("Вам нужен самолет побольше");
    }
}
