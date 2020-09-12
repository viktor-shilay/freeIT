package homework7.task4;

import java.util.Random;

public class SpaceX implements IStart {

    @Override
    public boolean preStartCheckSystem() {
        Random rand = new Random();
        int random = rand.nextInt(100);
        if (random>1){
            System.out.println("Пре-стартовая проверка SpaceX прошла успешно!");
            return true;
        }else {
            System.out.println("Пре-стартовая проверка SpaceX провалена!");
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX...");
    }
}
