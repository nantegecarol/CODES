/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pro.returnjourneytime;

/**
 *
 * @author CAROL
 */
public class ReturnJourneyTime {
    public static void main(String[] args) {
        int totalDistance = 10000; // Distance from Kabale to Kampala in km
        int speed = 250; // Speed in km/h
        int refuelStopInterval = 200;
        int stopTimeMinutes = 5; // Time per stop in minutes

        // Calculate travel time
        double travelTimeHours = (double) totalDistance / speed;

        // Calculate number of refuel stops
        int refuelStops = totalDistance / refuelStopInterval;
        if (totalDistance % refuelStopInterval == 0) refuelStops--;

        // Convert total stop time to hours
        double stopTimeHours = (refuelStops * stopTimeMinutes) / 60.0;

        // Total time is the sum of travel time and stop time
        double totalTimeHours = travelTimeHours + stopTimeHours;

        System.out.println("Total time taken for return journey: " + totalTimeHours + " hours");
    }
}

