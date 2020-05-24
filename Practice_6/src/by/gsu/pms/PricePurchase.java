package by.gsu.pms;

public class PricePurchase extends Purchase {

    private int discontOfPricePurchase;

    public PricePurchase(String nameOfPurchase, int priceOfPurchase, int countOfPurchase, int discontOfPricePurchase) {
        super(nameOfPurchase, priceOfPurchase, countOfPurchase);
        this.discontOfPricePurchase = discontOfPricePurchase;
    }

    public int getDiscontOfPricePurchase() {
        return discontOfPricePurchase;
    }

    public void setDiscontOfPricePurchase(int discontOfPricePurchase) {
        this.discontOfPricePurchase = discontOfPricePurchase;
    }

    @Override
    public String toString() {
        return super.toString() + " Discount of price purchase: "+ discontOfPricePurchase;
    }

    public int totalPrice(){
        return (getPriceOfPurchase() - discontOfPricePurchase) * getCountOfPurchase();
    }
}
