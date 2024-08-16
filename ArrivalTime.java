/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pro.arrivaltime;

/**
 *
 * @author CAROL
 */
import java.time.LocalTime;
import java.time.Duration;

public class ArrivalTime {
    public static void main(String[] args) {
        int totalDistanceKm = 10000; // Distance from Kabale to Kampala in km
        double speedMps = 225.5; // Speed in meters per second

        // Convert speed to km/h
        double speedKmph = speedMps * 3.6;

        // Calculate travel time in hours
        double travelTimeHours = (double) totalDistanceKm / speedKmph;

        // Calculate arrival time
        LocalTime departureTime = LocalTime.of(9, 0);
        Duration travelDuration = Duration.ofHours((long) travelTimeHours);
        LocalTime arrivalTime = departureTime.plus(travelDuration);

        System.out.println("Approximate arrival time: " + arrivalTime);
    }
}

