package org.example.trip.tripClasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


public class Points {
    private String city;
    private int distanceFromLast;

    public Points(String city, int distanceFromLast) {
        this.city = city;
        this.distanceFromLast = distanceFromLast;
    }

     public static void arrivalTimeCalc(List<Points> pointsList, LocalDateTime departure) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        for (Points p : pointsList) {
            double durationInHours = (double) p.distanceFromLast / 75.0; // average speed 75 km/h
            int durationInMinutes = (int) (durationInHours * 60.0);
            LocalDateTime arrivalTime = departure.plusMinutes(durationInMinutes);
            String formattedArrivalTime = arrivalTime.format(format);
            System.out.println(p.city + ": " + formattedArrivalTime);
            departure = arrivalTime;
        }
    }
}
