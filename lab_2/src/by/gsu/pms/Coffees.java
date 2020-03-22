package by.gsu.pms;

public class Coffees implements Comparable<Coffees> {

    private String coffeeName;
    private float coffeeSize;
    private int coffeePrice;

    public String getCoffeeName() {
        return coffeeName;
    }

    public float getCoffeeSize() {
        return coffeeSize;
    }

    public int getCoffeePrice() {
        return coffeePrice;
    }


    public void setCoffeeName(String coffeeName) { this.coffeeName = coffeeName;}

    public void setCoffeeSize(float coffeeSize) { this.coffeeSize = coffeeSize;}

    public void setCoffeePrice(int coffeePrice) { this.coffeePrice = coffeePrice;}


    public Coffees() {}

    public Coffees(String coffeeName, float coffeeSizes) {
        this.coffeeName = coffeeName;
        this.coffeeSize = coffeeSize;

    }

    public Coffees(String coffeeName, float coffeeSize, int coffeePrice) {
        this.coffeeName = coffeeName;
        this.coffeeSize = coffeeSize;
        this.coffeePrice = coffeePrice;

    }

    public int compareTo(Coffees compareCoffee) {
        return this.coffeePrice - compareCoffee.getCoffeePrice();
    }
}