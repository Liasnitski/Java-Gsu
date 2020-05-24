package com.company.lab_6;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import by.gsu.pms.Train;

public class Runner {
    public static void main(String[] args) throws IOException {

        ArrayList<Train> trains = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));

        String currentLine;
        while ((currentLine = bufferedReader.readLine()) != null) {

            String[] params = currentLine.split(" ");

            trains.add(new Train( params[0], Integer.parseInt(params[1]), Integer.parseInt(params[2]), Integer.parseInt(params[3]), Integer.parseInt(params[4]), Integer.parseInt(params[5]), Integer.parseInt(params[6])));
        }
        bufferedReader.close();

        Collections.sort(trains);

        String destination = "Gomel";
        System.out.println("Trains going to " + destination + ":");
        for (Train train: trains){
            if (train.getDestination().equals(destination)){
                train.showInfo();
            }
        }

        destination = "Brest";
        int departureTime = 2000;
        System.out.println("Trains going to " + destination + " and departure time after " + departureTime + ":");
        for (Train train: trains){
            if ((train.getDestination().equals(destination)) && (train.getDepartureTime() > departureTime)){
                train.showInfo();
            }
        }

        destination = "Minsk";
        int numberOfCommonSeats;
        System.out.println("Trains going to " + destination + " and have common seats:");
        for (Train train: trains){
            if ((train.getDestination().equals(destination)) && (train.getNumberOfCommonSeats() != 0)) {
                train.showInfo();
            }
        }

        File csvFile = new File("test_new.txt");
        try (PrintWriter csvWriter = new PrintWriter(new FileWriter(csvFile))){
            for(Train book : trains){
                csvWriter.println(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
