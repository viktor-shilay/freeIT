package homework7.task1;

public class MilitaryTransport extends AirTransport {

    private boolean ejectionSystem;
    private int numberOfMissiles;

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        this.ejectionSystem = ejectionSystem;
    }

    public int getNumberOfMissiles() {
        return numberOfMissiles;
    }

    public void setNumberOfMissiles(int numberOfMissiles) {
        this.numberOfMissiles = numberOfMissiles;
    }

    @Override
    public String printParameters(){
        return "Model: " + getModel()+ "\nWeight: "+ getWeight()+ "\nmaxSpeed: " +getMaxSpeed()+ "\nPower (h.p.): " + getPower() + "\nPower (kW): " + getKilowatt()+ "\nStrip lenght: "+ getStripLenght()+ "\nWingspan: "+ getWingspan()
                +"\nEjection system: " + this.ejectionSystem+ "\nNumber of missiles: "+ this.numberOfMissiles +"\n";
    }

    public void shot(){
        if (this.numberOfMissiles==0){
            System.out.println("Боеприпасы отсутствуют");
        }
        else System.out.println("Ракета пошла...");
    }

    public void ejection(){
        if (this.ejectionSystem){
            System.out.println("Катапультирование прошло успешно!");
        }
        else System.out.println("У вас нет такой системы!");
    }
}
