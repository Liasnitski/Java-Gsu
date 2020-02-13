package by.gsu.pms;

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

    public double convert(){
        return this.transExp / 100.0;
    }

    public double getTotal() {
        return this.convert() + RATE * days;
    }

    public String  toString() {
        return name + ";" + convert() + ";" + days + ";" + getTotal();
    }

    public void show()
    {
        System.out.println("Rate = " + this.RATE);
        System.out.println("Account = " + this.name);
        System.out.println("Transport = " + convert());
        System.out.println("Days = " + this.days);
        System.out.println("Total = " + this.getTotal());
    }
}



