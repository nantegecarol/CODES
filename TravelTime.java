/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pro.traveltime;

/**
 *
 * @author CAROL
 */

   public class TravelTime {
    public static void main(String[] args) {
        int totalDistance = 10000; // Distance from Kampala to Kabale in km
        int speed = 250; // Speed in km/h
        int stopTimeMinutes = 5; // Time per stop in minutes

        // Calculate travel time
        double travelTimeHours = (double) totalDistance / speed;

        // Calculate number of stops from previous problem
        int passengerStops = totalDistance / 150;
        if (totalDistance % 150 == 0) passengerStops--;

        int refuelStops = totalDistance / 200;
        if (totalDistance % 200 == 0) refuelStops--;

        int totalStops = passengerStops + refuelStops;

        // Convert total stop time to hours
        double stopTimeHours = (totalStops * stopTimeMinutes) / 60.0;

        // Total time is the sum of travel time and stop time
        double totalTimeHours = travelTimeHours + stopTimeHours;

        System.out.println("Total time taken: " + totalTimeHours + " hours");
    }
}
