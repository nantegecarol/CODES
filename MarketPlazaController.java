/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pro.marketplazacontroller;

/**
 *
 * @author CAROL
 */
import java.util.Scanner;

public class MarketPlazaController {

    // Inner class for managing the Lecture Room
    static class LectureRoom {
        private int students;
        private boolean[] lights;

        public LectureRoom() {
            this.students = 0;
            this.lights = new boolean[3]; // Three lights, all off by default
        }

        public void addStudents(int count) {
            if (count > 0) {
                this.students += count;
            }
        }

        public void removeStudents(int count) {
            if (count > 0) {
                this.students = Math.max(0, this.students - count);
            }
        }

        public void turnOnLight(int lightNumber) {
            if (lightNumber >= 1 && lightNumber <= 3) {
                this.lights[lightNumber - 1] = true;
            }
        }

        public void turnOffLight(int lightNumber) {
            if (lightNumber >= 1 && lightNumber <= 3) {
                this.lights[lightNumber - 1] = false;
            }
        }

        public int getStudents() {
            return this.students;
        }

        public boolean[] getLightsStatus() {
            return this.lights;
        }
    }

    // Inner class for handling user input
    static class EasyReader {
        private Scanner scanner;

        public EasyReader() {
            this.scanner = new Scanner(System.in);
        }

        public String readString() {
            return this.scanner.nextLine();
        }

        public int readInt() {
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid integer:");
                scanner.next();
            }
            int value = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
            return value;
        }
    }

    public static void main(String[] args) {
        LectureRoom room = new LectureRoom();
        EasyReader reader = new EasyReader();
        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("W: Add students to the room");
            System.out.println("X: Remove students from the room");
            System.out.println("Y: Turn on a light");
            System.out.println("Z: Turn off a light");
            System.out.println("Q: Quit");

            String choice = reader.readString().toUpperCase();

            switch (choice) {
                case "W":
                    System.out.println("Enter the number of students to add:");
                    int studentsToAdd = reader.readInt();
                    room.addStudents(studentsToAdd);
                    System.out.println(studentsToAdd + " students added. Total: " + room.getStudents());
                    break;
                case "X":
                    System.out.println("Enter the number of students to remove:");
                    int studentsToRemove = reader.readInt();
                    room.removeStudents(studentsToRemove);
                    System.out.println(studentsToRemove + " students removed. Total: " + room.getStudents());
                    break;
                case "Y":
                    System.out.println("Enter the light number to turn on (1, 2, or 3):");
                    int lightOn = reader.readInt();
                    room.turnOnLight(lightOn);
                    System.out.println("Light " + lightOn + " is now ON.");
                    break;
                case "Z":
                    System.out.println("Enter the light number to turn off (1, 2, or 3):");
                    int lightOff = reader.readInt();
                    room.turnOffLight(lightOff);
                    System.out.println("Light " + lightOff + " is now OFF.");
                    break;
                case "Q":
                    running = false;
                    System.out.println("Quitting the program...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }

            // Display room status
            System.out.println("\nCurrent number of students: " + room.getStudents());
            System.out.println("Light statuses:");
            boolean[] lights = room.getLightsStatus();
            for (int i = 0; i < lights.length; i++) {
                System.out.println("Light " + (i + 1) + ": " + (lights[i] ? "ON" : "OFF"));
            }
        }
    }
}
