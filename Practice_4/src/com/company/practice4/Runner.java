package com.company.practice4;
import by.gsu.pms.BusinessTrip;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.util.Comparator;


public class Runner {

    public static void main(String[] args)  throws FileNotFoundException {

        FileReader text = new FileReader("in.txt");

        Scanner scanner = new Scanner(text);

        double Rate = Double.parseDouble(scanner.nextLine().split("=")[1]);
        int[] indices = Arrays.stream(scanner.nextLine().split("=")[1].split(";")).mapToInt(Integer::parseInt).toArray();

        BusinessTrip[] businessTrips = new BusinessTrip[indices.length];

        for (int i=0; i < indices.length; i++){
            String name = scanner.nextLine().split("=")[1];
            int transExp = Integer.parseInt(scanner.nextLine().split("=")[1]);
            int days = Integer.parseInt(scanner.nextLine().split("=")[1]);

            businessTrips[i] = new BusinessTrip(name, transExp, days);
        }

        Arrays.sort(businessTrips, Comparator.comparing(BusinessTrip::getTotal).reversed());

        for (BusinessTrip businessTrip : businessTrips) {
            if (businessTrip != null) {
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