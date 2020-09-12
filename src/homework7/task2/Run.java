package homework7.task2;

import homework7.task2.hands.SamsungHand;
import homework7.task2.hands.SonyHand;
import homework7.task2.hands.ToshibaHand;
import homework7.task2.heads.SamsungHead;
import homework7.task2.heads.ToshibaHead;
import homework7.task2.legs.SamsungLeg;
import homework7.task2.legs.SonyLeg;
import homework7.task2.legs.ToshibaLeg;
import homework7.task2.heads.SonyHead;

import java.util.Arrays;

/*Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
Класс SonyHead является примером реализацией головы от Sony.
Создайте 3 робота с разными комплектующими.
Например у робота голова и нога от Sony а, рука от Samsung.
У всех роботов вызовите метод action.
Среди 3-х роботов найдите самого дорогого.
*/

public class Run {
    public static void main(String[] args) {
        Robot robot1 = new Robot(new SonyHead(1240), new SamsungHand(490), new SonyLeg(490));
        Robot robot2 = new Robot(new ToshibaHead(1020), new SonyHand(420), new SamsungLeg(620));
        Robot robot3 = new Robot(new SamsungHead(1550), new ToshibaHand(360), new ToshibaLeg(420));
        robot1.action();
        System.out.println();
        robot2.action();
        System.out.println();
        robot3.action();
        Robot [] robots = new Robot[3];
        robots[0] = robot1;
        robots[1] = robot2;
        robots[2] = robot3;
        Arrays.sort(robots, (o1, o2) -> o2.getPrice() - o1.getPrice());
        System.out.println("Самый дорогой робот стоит " + robots[0].getPrice() +
                " и состоит из головы " + robots[0].getHead().getClass().getSimpleName()+ " стоимостью "+ robots[0].getHead().getPrice() +
                ", руки "+ robots[0].getHand().getClass().getSimpleName()+ " стоимостью "  + robots[0].getHand().getPrice() +
                " и ноги " + robots[0].getLeg().getClass().getSimpleName() + " стоимостью "  + robots[0].getLeg().getPrice());
    }
}
