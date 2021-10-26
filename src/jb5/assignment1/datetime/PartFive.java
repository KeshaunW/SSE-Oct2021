package jb5.assignment1.datetime;

import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.util.Locale;
import java.util.Scanner;

public class PartFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a year: ");
        int y = in.nextInt();

        for (Month m: Month.values()) {
            YearMonth month = YearMonth.of(y, m);
            System.out.println(m.name().substring(0, 1) + m.name().substring(1).toLowerCase() + ", " + y + " - " + month.lengthOfMonth() + " days.");
        }
    }
}
