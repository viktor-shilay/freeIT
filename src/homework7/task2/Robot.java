package homework7.task2;

import homework7.task2.hands.IHand;
import homework7.task2.heads.IHead;
import homework7.task2.legs.ILeg;

public class Robot implements IRobot {
    private IHead head;
    private IHand hand;
    private ILeg leg;

    public Robot(IHead head, IHand hand, ILeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot(){}

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

    @Override
    public void action() {
        head.speek();
        hand.upHand();
        leg.step();
    }

    /**
     * Get the cost of a robot
     * @return int
     */
    @Override
    public int getPrice() {
        return head.getPrice() + hand.getPrice() + leg.getPrice();
    }

}
