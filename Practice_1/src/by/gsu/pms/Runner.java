import by.gsu.pms.BusinessTrip;

public class Runner {

    public static void main(String[] args) {
        BusinessTrip[] businessTrips = {
                new BusinessTrip("Ivanov", 221, 25),
                null,
                new BusinessTrip("Petrov", 112, 45),
                new BusinessTrip("Sokolov", 224, 87),
                new BusinessTrip()
        };
        for (BusinessTrip businessTrip : businessTrips) {
            if (businessTrip != null)
            {
                businessTrip.show();
                System.out.println();
            }
        }
        businessTrips[businessTrips.length - 1].setTransExp(5765);

        System.out.println("Duration = " + (businessTrips[0].getTotal() + businessTrips[2].getTotal()));

        for (BusinessTrip businessTrip : businessTrips) {
            if (businessTrip != null){
                System.out.println(businessTrip.toString());
            }

        }

    }

}