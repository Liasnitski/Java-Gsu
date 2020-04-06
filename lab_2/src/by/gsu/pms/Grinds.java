package by.gsu.pms;

public class Grinds extends Coffees {

    private String extentGrinds;

    public String getExtentGrinds() {
        return extentGrinds;
    }

    public void setExtentGrinds(String extentGrinds) {
        this.extentGrinds = extentGrinds;
    }

    public Grinds() { super();}

    public Grinds(String coffeeName, float coffeeSize) { super(coffeeName, coffeeSize);}

    public Grinds(String coffeeName, float coffeeSize, int coffeePrice) { super(coffeeName, coffeeSize, coffeePrice);}

    public String infoAboutClass (){
        return  "Grinds - "+ super.infoAboutClass() + extentGrinds;
    }
}