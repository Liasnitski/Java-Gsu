package com.company.practice1;
import by.gsu.pms.BusinessTrip;

public class Runner {

    public static void main(String[] args) {
        BusinessTrip[] businessTrips = {
                new BusinessTrip("Ivanov", 220000, 25),
                new BusinessTrip("Petrov", 112000, 45),
                null,
                new BusinessTrip("Sokolov", 132000, 12),
                new BusinessTrip("Liasnitski", 114000, 32),
                new BusinessTrip("Pablo", 44000, 44),
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

        System.out.println("Duration = " + (businessTrips[0].getDays() + businessTrips[1].getDays()));

        for (BusinessTrip businessTrip : businessTrips) {
            if (businessTrip != null){
                System.out.println(businessTrip.toString());
            }

        }

    }

}