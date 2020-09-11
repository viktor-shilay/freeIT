package homework7.task1;

public class TransportRunner {
    public static void main(String[] args) {

        PassengerTransport passTransport = new PassengerTransport();
        passTransport.setModel("Audi");
        passTransport.setMaxSpeed(360);
        passTransport.setPower(132);
        passTransport.setWeight(1980);
        passTransport.setFuelConsuption(5.5);
        passTransport.setNumberOfPassengers(2);
        passTransport.setBodyType("Sedan");
        passTransport.setWheels(4);
        System.out.println(passTransport.printParameters());
        passTransport.result(10);

        FreightTransport freightTransport = new FreightTransport();
        freightTransport.setModel("МАЗ");
        freightTransport.setWeight(33000);
        freightTransport.setMaxSpeed(85);
        freightTransport.setPower(330);
        freightTransport.setFuelConsuption(41.9);
        freightTransport.setWheels(4);
        freightTransport.setLoadCapacity(20000);
        System.out.println(freightTransport.printParameters());
        freightTransport.result();

        MilitaryTransport millTransport = new MilitaryTransport();
        millTransport.setModel("Су-57");
        millTransport.setWeight(18500);
        millTransport.setMaxSpeed(2500);
        millTransport.setPower(110000);
        millTransport.setStripLenght(2800);
        millTransport.setWingspan(14.1);
        millTransport.setNumberOfMissiles(4);
        millTransport.setEjectionSystem(true);
        System.out.println(millTransport.printParameters());
        millTransport.shot();
        millTransport.ejection();

        CivilTransport civilTransport = new CivilTransport();
        civilTransport.setModel("Boeing-747");
        civilTransport.setWeight(181120);
        civilTransport.setMaxSpeed(920);
        civilTransport.setPower(1200);
        civilTransport.setStripLenght(3500);
        civilTransport.setWingspan(64.4);
        civilTransport.setNumberOfPassengers(524);
        civilTransport.setBusinessClass(true);
        System.out.println(civilTransport.printParameters());
        civilTransport.result();

    }
}
