package by.gsu.pms;
import java.util.Comparator;

public class Icecream implements Comparable<Icecream> {
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

    public int compareTo(Icecream compareIcecream) {
        if (this.fat < compareIcecream.getFat()) {
            return -1;
        } else if (this.fat > compareIcecream.getFat()) {
            return 1;
        }
        return 0;
    }

    public static Comparator<Icecream> IcecreamNameComparator = new Comparator<Icecream>() {

        public int compare(Icecream icecream1, Icecream icecream2) {
            String icecreamName1 = icecream1.getName().toUpperCase();
            String icecreamName2 = icecream2.getName().toUpperCase();

            return icecreamName1.compareTo(icecreamName2);
        }
    };

}