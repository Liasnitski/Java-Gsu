package by.gsu.pms;

public class Purchase {

    private String name;
    private int price;
    private int numberOfUnits;

    public Purchase(){
        super();
    }

    public Purchase(String name, int price, int numberOfUnits) {
        this.name = name;
        this.price = price;
        this.numberOfUnits = numberOfUnits;

    }

    public String getName() {        return name;    }
    public void setName(String name) {        this.name = name;    }

    public int getPrice() {        return price;    }
    public void setPrice(int price) {        this.price = price;    }

    public int getNumberOfUnits() {        return numberOfUnits;    }
    public void setNumberOfUnits(int numberOfUnits) {        this.numberOfUnits = numberOfUnits;    }

    public double getCost(){
        return price * numberOfUnits;
    }

    public String toString(){
        return name + ";" + price + ";" + numberOfUnits + ";" + getCost();
    }

    public boolean equals(Purchase purchase){
        return this.name.equals(purchase.name) || this.price == purchase.price;
    }



}
