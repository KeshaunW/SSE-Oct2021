package jb5.assignment1.lambda;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class PartThree {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("eve");
        strings.add("air");
        strings.add("airplaine");
        strings.add("lie");
        strings.add("evil");
        strings.add("app");

        System.out.println(String.join(", ", sortStrings(strings)));

        LocalDate date = LocalDate.now();
        System.out.println(date.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY)));
    }

    private static List<String> sortStrings(List<String> list) {
        return list.stream().filter(line -> line.startsWith("a") && line.length() == 3).collect(Collectors.toList());
    }
}
