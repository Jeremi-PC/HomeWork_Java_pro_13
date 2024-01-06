package org.example.trip;

import org.example.trip.tripClasses.Points;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// Пользователь планирует поездку из Берлина в Стамбул на автомобиле.
// Выберите несколько точек на маршруте и прикиньте длительность путешествия между этими точками.
// Пользователь вводит дату и время своего отправления.
// Программа должна вывести расписание (дату и время), когда пользователь должен прибыть в указанные пункты.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input date of departure (dd-MM-yyyy HH:mm): ");

        List<Points> pointsList = new LinkedList<>();
        pointsList.add(new Points("Berlin", 0));
        pointsList.add(new Points("Prague", 350));
        pointsList.add(new Points("Vienna", 310));
        pointsList.add(new Points("Budapest", 244));
        pointsList.add(new Points("Sofia", 769));
        pointsList.add(new Points("Istanbul", 552));

        try {
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
            LocalDateTime dateOfDeparture = LocalDateTime.parse(sc.nextLine(), format);
            Points.arrivalTimeCalc(pointsList, dateOfDeparture);
        } catch (DateTimeException e) {
            System.out.println("Incorrect date format entered.");
        }
    }
}
