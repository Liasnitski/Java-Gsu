package by.gsu.pms;

public class Grains extends Coffees {

    private String extentGrains;

    public String getExtentGrains() {
        return extentGrains;
    }

    public void setExtentGrains(String extentGrains) {
        this.extentGrains = extentGrains;
    }

    public Grains() {
        super();
    }

    public Grains(String coffeeName, float coffeeSize) {
        super(coffeeName, coffeeSize);
    }

    public Grains(String coffeeName, float coffeeSize, int coffeePrice) {
        super(coffeeName, coffeeSize, coffeePrice);
    }

    public String infoAboutClass (){
        return  "Grains - "+ super.infoAboutClass() + extentGrains;
    }
}