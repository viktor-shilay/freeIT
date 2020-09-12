package homework7.task3;

import homework7.task3.jacket.Coat;
import homework7.task3.jacket.WindBreaker;
import homework7.task3.pants.Jeans;
import homework7.task3.pants.Pants;
import homework7.task3.shoes.Shoes;
import homework7.task3.shoes.Sneakers;

public class Run {
    public static void main(String[] args) {
        Human human1 = new Human("Victor", new Coat(42), new Jeans(40), new Sneakers(42));
        human1.dress();
        System.out.println(human1.toString());
        human1.undress();

        System.out.println();

        Human human2 = new Human("Roman", new WindBreaker(54), new Pants(46), new Shoes(42));
        human1.dress();
        System.out.println(human2.toString());
        human2.undress();
    }
}
