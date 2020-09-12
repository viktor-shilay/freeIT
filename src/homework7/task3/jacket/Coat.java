package homework7.task3.jacket;

public class Coat implements IJacket {
    private int size;

    public Coat(int size){
        this.size = size;
    }


    @Override
    public void putOn() {
        System.out.println("Putting on the coat...");
    }

    @Override
    public void putOff() {
        System.out.println("Putting off the coat...");
    }

    @Override
    public String toString() {
        return "Coat (size = " + size + ")";
    }
}
