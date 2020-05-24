package by.gsu.pms;

public class Purchase implements Comparable<Purchase> {

    private String nameOfPurchase;
    private int priceOfPurchase;
    private int countOfPurchase;

    public Purchase( String nameOfPurchase, int priceOfPurchase, int countOfPurchase){
        this.nameOfPurchase = nameOfPurchase;
        this.priceOfPurchase = priceOfPurchase;
        this.countOfPurchase = countOfPurchase;
    }

    public String getNameOfPurchase() {        return nameOfPurchase;    }
    public void setNameOfPurchase(String nameOfPurchase) {        this.nameOfPurchase = nameOfPurchase;    }

    public int getPriceOfPurchase() {        return priceOfPurchase;    }
    public void setPriceOfPurchase(int priceOfPurchase) {        this.priceOfPurchase = priceOfPurchase;    }

    public int getCountOfPurchase() {        return countOfPurchase;    }
    public void setCountOfPurchase(int countOfPurchase) {        this.countOfPurchase = countOfPurchase;    }

    public int totalPrice(){
        return priceOfPurchase * countOfPurchase;
    }

    @Override
    public String toString() {
        return "Name: " + nameOfPurchase + " Price: " + priceOfPurchase + " Count: " + countOfPurchase + " Total price: " + totalPrice();
    }

    @Override
    public int compareTo(Purchase o) {
        return Integer.compare(this.getPriceOfPurchase(), o.getPriceOfPurchase());
    }
}
