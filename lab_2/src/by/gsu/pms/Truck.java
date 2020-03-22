package by.gsu.pms;

public class Truck {
    private String coffeeName;
    private Coffees[] truckComponents;

    public Truck() {
        this.truckComponents = new Coffees[0];
    }

    public Truck(Coffees[] truckComponents) {
        this.truckComponents = truckComponents;
    }

    public Truck(String coffeeName, Coffees[] truckComponents) {
        this.coffeeName = coffeeName;
        this.truckComponents = truckComponents;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public Coffees[] getTruckComponents() {
        return truckComponents;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public void setTruckComponents(Coffees[] truckComponents) {
        this.truckComponents = truckComponents;
    }

    public float getTruckSize() {
        float totalSize = 0;
        for (Coffees coffee: truckComponents) {
            totalSize += coffee.getCoffeeSize();
        }
        return totalSize;
    }

    public int getTruckPrice() {
        int totalPrice = 0;
        for (Coffees coffee: truckComponents) {
            totalPrice += coffee.getCoffeePrice();
        }
        return totalPrice;
    }

    public int getTruckPriceSize() {
        return Math.round(getTruckPrice()  / getTruckSize());
    }
}