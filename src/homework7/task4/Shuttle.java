package homework7.task4;

import java.util.Random;

public class Shuttle implements IStart{

    @Override
    public boolean preStartCheckSystem() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(11);
        if (randomNumber>3){
            System.out.println("Пре-стартовая проверка Шатла прошла успешно!");
            return true;
        }else {
            System.out.println("Пре-стартовая проверка Шатла провалена!");
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла...");
    }
}
