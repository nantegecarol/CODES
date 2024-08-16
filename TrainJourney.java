/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pro.trainjourney;

/**
 *
 * @author CAROL
 */
public class TrainJourney {
    public static void main(String[] args) {
        int totalDistance = 10000;
        int stopDistance = 150;
        
        int numStops = totalDistance / stopDistance;
        
        System.out.println("The train should stop " + numStops + " times when travelling from Kampala to Kabale.");
    }
}
   

