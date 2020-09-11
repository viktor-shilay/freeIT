package homework7.task1;

import java.util.Scanner;

public class FreightTransport extends GroundTransport{

    private double loadCapacity;

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String printParameters(){
        return "Model: " + getModel()+ "\nWeight: "+ getWeight()+ "\nmaxSpeed: " +getMaxSpeed()+ "\nPower (h.p.): " + getPower() + "\nPower (kW): " + getKilowatt()+ "\nConsuption: "+ getFuelConsuption()+ "\nNumber of wheels: "+ getWheels()
                +"\nLoad Capacity: " + this.loadCapacity+ "\n";
    }

    public void result(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Кол-во груза, которое необходимо загрузить:");
        double capacity = myScanner.nextDouble();
        if (capacity<this.loadCapacity){
            System.out.println("Грузовик загружен");
        }else System.out.println("Вам нужен грузовик побольше");
    }

}
