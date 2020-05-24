package by.gsu.pms;
import by.gsu.pms.Converter;

public class BusinessTrip {

    private static final int RATE = 25000;
    private String name;
    private int transExp;
    private int days;

    public BusinessTrip() {}

    public BusinessTrip(String name, int transExp, int days) {
        this.name = name;
        this.transExp = transExp;
        this.days = days;
    }
    public int getTransExp() {
        return transExp;
    }
    public void setTransExp(int transExp) {
        this.transExp = transExp;
    }

    public int getDays() {
        return days;
    }
    public void setDays(int days) {
        this.days = days;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



    public int getTotal() {
        if (days ==1){
            return transExp;
        } else if (days > 1){
            return this.transExp + RATE * days;
        }else {return 0;}


    }

    public String  toString() {
        return name + ";" + Converter.convert((double) transExp, 10000, 2) + ";" + days + ";" + Converter.convert(this.getTotal(), 10000, 2);
    }

    public void show()
    {
        System.out.println("Rate = " + RATE);
        System.out.println("Account = " + name);
        System.out.println("Transport = " + transExp);
        System.out.println("Days = " + days);
        System.out.println("Total = " + getTotal());
    }
}