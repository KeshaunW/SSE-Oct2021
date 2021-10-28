package jb5.assignment1.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Scanner;

public class PartSix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a month: ");
        String m = in.nextLine();
        Month month;

        try {
            month = Month.valueOf(m.toUpperCase());
        } catch(Exception e) {
            System.out.println("Not a valid month.");
            throw e;
        }

        LocalDate date = LocalDate.of(Year.now().getValue(), month, 1).with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        Month mi = date.getMonth();
        while (mi == month) {
            System.out.println(date);
            date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            mi = date.getMonth();
        }
    }
}
