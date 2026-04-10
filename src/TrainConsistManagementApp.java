import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger Bogies after addition:");
        System.out.println(passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        boolean isSleeperPresent = passengerBogies.contains("Sleeper");

        System.out.println("\nIs Sleeper bogie present? " + isSleeperPresent);

        System.out.println("\nFinal Passenger Bogies:");
        System.out.println(passengerBogies);
    }
}