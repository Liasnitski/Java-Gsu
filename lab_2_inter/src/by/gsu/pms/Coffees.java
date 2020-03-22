package by.gsu.pms;

public interface Coffees extends Comparable<Coffees> {

    String getCoffeeName();

    float getCoffeeSize();

    int getCoffeePrice();


    void setCoffeeName(String coffeeName);

    void setCoffeeSize(float coffeeSize);

    void setCoffeePrice(int coffeePrice);

    int compareTo(Coffees compareCoffee);
}