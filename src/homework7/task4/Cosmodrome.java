package homework7.task4;

public class Cosmodrome{

    public boolean start (IStart obj) throws InterruptedException {

        if (obj instanceof IStart){
            obj.startEngine();
            for (int i = 10; i > 0 ; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
            obj.start();
            return true;
        }else {
            System.out.println("Предстартовая проверка провалена!");
            return false;
        }
    }
}
