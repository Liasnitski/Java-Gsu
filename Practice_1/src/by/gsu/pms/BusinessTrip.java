package by.gsu.pms;
import by.gsu.pms.Converter;

public class BusinessTrip {

    private static final int RATE = 7;
    private String name;
    private int transExp;
    private int days;

    public BusinessTrip() {
        super();
    }

    public BusinessTrip(String name, int transExp, int days) {
        super();
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



    public double getTotal() {
        return this.transExp + RATE * days;
    }

    public String  toString() {
        return name + ";" + Converter.convert((double) transExp, 10000, 2) + ";" + days + ";" + Converter.convert(this.getTotal(), 10000, 2);
    }

    public void show()
    {
        System.out.println("Rate = " + this.RATE);
        System.out.println("Account = " + this.name);
        System.out.println("Transport = " + transExp);
        System.out.println("Days = " + this.days);
        System.out.println("Total = " + this.getTotal());
    }
}



