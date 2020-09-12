package homework7.task3;

import homework7.task3.jacket.IJacket;
import homework7.task3.pants.IPants;
import homework7.task3.shoes.IShoes;

public class Human {
    private String name;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public Human (String name, IJacket jacket, IPants pants, IShoes shoes){
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public String getName() {
        return name;
    }

    public void dress(){
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    public void undress(){
        jacket.putOff();
        pants.putOff();
        shoes.putOff();
    }

    @Override
    public String toString() {
        return name + " wears: \n" + jacket.toString() + "\n" + pants.toString() + "\n" + shoes.toString();
    }
}
