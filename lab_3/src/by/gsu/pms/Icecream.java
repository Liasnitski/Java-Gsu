package by.gsu.pms;
import com.sun.xml.internal.ws.developer.Serialization;

import java.io.Serializable;



public class Icecream implements Serializable {
    private String name;
    private boolean chocolate;
    private double fat;

    public Icecream(){};

    public Icecream(String name, boolean chocolate, double fat ) {
        this.name = name;
        this.chocolate = chocolate;
        this.fat = fat;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean getChocolate() {
        return chocolate;
    }
    public void setChocolate(boolean chocolate) {
        this.chocolate = chocolate;
    }

    public double getFat() {
        return fat;
    }
    public void setFat(double fat) {
        this.fat = fat;
    }

    public String toString(){
        return name + "; " + chocolate + "; " + fat + "%";
    }

    public void show()
    {
        System.out.println("Name = " + this.name);
        System.out.println("Chocolate = " + this.chocolate);
        System.out.println("Fat = " + this.fat);
        System.out.println("String = " + toString());
    }



}