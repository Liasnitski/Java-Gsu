package by.gsu.pms;

public class Grinds implements Coffees {

    private String coffeeName;
    private float coffeeSize;
    private int coffeePrice;

    public String getCoffeeName() { return coffeeName; }

    public float getCoffeeSize() { return coffeeSize; }

    public int getCoffeePrice() { return coffeePrice; }

    public void setCoffeeName(String coffeeName) { this.coffeeName = coffeeName; }

    public void setCoffeePrice(int coffeePrice) { this.coffeePrice = coffeePrice; }

    public void setCoffeeSize(float coffeeSize) { this.coffeeSize = coffeeSize; }

    public Grinds() {}

    public Grinds(String coffeeName, float coffeeSize) {
        this.coffeeName = coffeeName;
        this.coffeeSize = coffeeSize;
    }

    public Grinds(String coffeeName, float coffeeSize, int coffeePrice) {
        this.coffeeName = coffeeName;
        this.coffeeSize = coffeeSize;
        this.coffeePrice = coffeePrice;
    }

    public int compareTo(Coffees compareCoffee) {
        return this.coffeePrice - compareCoffee.getCoffeePrice();
    }

    public String infoAboutClass() {
        return  coffeeName + "; " + coffeePrice + "; " + coffeeSize;
    }
}