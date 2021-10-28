package jb5.assignment1.datetime;

import java.text.DateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Scanner;

public class PartSeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Month month;

        System.out.print("Enter a month: ");
        String m = in.nextLine();
        System.out.print("Enter a year: ");
        int y = in.nextInt();

        try {
            month = Month.valueOf(m.toUpperCase());
        } catch(Exception e) {
            System.out.println("Not a valid month.");
            throw e;
        }

        LocalDate date = LocalDate.of(y, month, 13);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("LLLL dd, yyyy");
        if (date.get(ChronoField.DAY_OF_WEEK) == DayOfWeek.FRIDAY.getValue())
            System.out.println(date.format(format) + " is Friday the Thirteenth.");
        else
            System.out.println(date.format(format) + " is not Friday the Thirteenth.");
    }
}
