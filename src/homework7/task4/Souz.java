package homework7.task4;

import java.util.Random;

public class Souz implements IStart {

    @Override
    public boolean preStartCheckSystem() {
        Random rand = new Random();
        if (rand.nextBoolean()){
            System.out.println("Пре-стартовая проверка Союза прошла успешно!");
            return true;
        }else {
            System.out.println("Пре-стартовая проверка Союза провалена!");
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Союза запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Союза...");
    }
}
