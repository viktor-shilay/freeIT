package homework7.manual.task26;

/*Создать иерархию классов, описывающих бытовую технику. Создать несколько
объектов описанных классов, часть из них включить в розетку.
Иерархия должна иметь хотя бы три уровня.
 */

public class ApplianceCreator {
    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator("Atlant",717,2017,92);
        System.out.println("Refrigerator name is " + refrigerator.getName());
        refrigerator.turnOn();

        Microwave microwave = new Microwave("Bosch", 950, 2019, 20);
        System.out.println("Microwave price is " + microwave.getPrice());
        microwave.turnOn();

        Iron iron = new Iron("Philips", 77, 2020, 2000);
        System.out.println("Iron power is " + iron.getPower());
        iron.turnOn();

    }
}
