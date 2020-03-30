package by.gsu.pms;

public class Solubles extends Coffees {

    private String extentSolubles;

    public String getExtentSolubles(){
        return extentSolubles;
    }

    public void setExtentSolubles(String extentSolubles) {
        this.extentSolubles = extentSolubles;
    }

    public Solubles() {
        super();
    }

    public Solubles(String coffeeName, float coffeeSize) { super(coffeeName, coffeeSize);}

    public Solubles(String coffeeName, float coffeeSize, int coffeePrice) {
        super(coffeeName, coffeeSize, coffeePrice);
    }

    public String infoAboutClass (){
        return  "Solubles - "+ super.infoAboutClass() + extentSolubles;
    }
}