package by.gsu.pms;
import java.util.Comparator;

public class Train implements Comparable<Train> {

    private String destination;
    private int numberOfTrain;
    private int departureTime;
    private int numberOfCommonSeats;
    private int numberOfCoupeSeats;
    private int numberOfReservedSeats;
    private int numberOfLuxSeats;

    public Train(){};

    public Train(String destination, int numberOfTrain, int departureTime, int numberOfCommonSeats, int numberOfCoupeSeats, int numberOfReservedSeats, int numberOfLuxSeats ) {
        this.destination = destination;
        this.numberOfTrain = numberOfTrain;
        this.departureTime = departureTime;
        this.numberOfCommonSeats = numberOfCommonSeats;
        this.numberOfCoupeSeats = numberOfCoupeSeats;
        this.numberOfReservedSeats = numberOfReservedSeats;
        this.numberOfLuxSeats = numberOfLuxSeats;
    }

    public String getDestination() {        return destination;    }
    public void setDestination(String destination) {        this.destination = destination;    }

    public int getNumberOfTrain() {        return numberOfTrain;    }
    public void setNumberOfTrain(int numberOfTrain) {        this.numberOfTrain = numberOfTrain;    }

    public int getDepartureTime() {        return departureTime;    }
    public void setDepartureTime(int departureTime) {        this.departureTime = departureTime;    }

    public int getNumberOfCommonSeats() {        return numberOfCommonSeats;    }
    public void setNumberOfCommonSeats(int numberOfCommonSeats) {        this.numberOfCommonSeats = numberOfCommonSeats;    }

    public int getNumberOfCoupeSeats() {        return numberOfCoupeSeats;    }
    public void setNumberOfCoupeSeats(int numberOfCoupeSeats) {        this.numberOfCoupeSeats = numberOfCoupeSeats;    }

    public int getNumberOfReservedSeats() {        return numberOfReservedSeats;    }
    public void setNumberOfReservedSeats(int numberOfReservedSeats) {        this.numberOfReservedSeats = numberOfReservedSeats;    }

    public int getNumberOfLuxSeats() {        return numberOfLuxSeats;    }
    public void setNumberOfLuxSeats(int numberOfLuxSeats) {        this.numberOfLuxSeats = numberOfLuxSeats;    }

    @Override
    public String toString() {
        return destination + ";" + numberOfTrain + ";" + departureTime + ";" + numberOfCommonSeats + ";" + numberOfCoupeSeats + ";" + numberOfReservedSeats + ";" + numberOfLuxSeats;
    }

    public void showInfo(){
        System.out.println("\nDestination: " + destination + "\nNumberOfTrain: " + numberOfTrain + "\nDepartureTime: " + departureTime + "\nNumberOfCommonSeats: " + numberOfCommonSeats
                + "\nNumberOfCoupeSeats: " + numberOfCoupeSeats + "\nNumberOfReservedSeats: " + numberOfReservedSeats + "\nNumberOfLuxSeats: " + numberOfLuxSeats + "\n");
    }

    @Override
    public int compareTo(Train o) {
        return destination.compareTo(o.getDestination());
    }
}
