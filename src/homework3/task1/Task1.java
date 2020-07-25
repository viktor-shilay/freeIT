package homework3.task1;

/*Начав тренировки, спортсмен в первый день пробежал 10 км.
Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
Какой суммарный путь пробежит спортсмен за 7 дней?
 */

public class Task1 {
    public static void main(String[] args) {
        int days = 7;
        double distance = 10;
        double dailyRate = 0.1;
        double totalDistance = 0;
        for (int i= 1; i<=days; i++){
            totalDistance += distance;
            distance += (distance * dailyRate);
        }
        System.out.println("Total distance for "+ days+ " days: " + totalDistance);
    }
}
