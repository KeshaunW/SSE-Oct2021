package jb5.assignment1;

import java.util.Arrays;
import java.util.Locale;

interface SortOperation {
    String[] sort(String[] list);
}

public class PartOne {
    public static void main(String[] args) {
        String[] values = {"Smoothstack Essentials", "Washington D.C.", "Java Basics 5", "United States of America"};
        System.out.println("Original: " + String.join(", ", values));

        Arrays.sort(values, (String one, String two) -> one.length() - two.length());
        System.out.println("Length: " + String.join(", ", values));

        Arrays.sort(values, (String one, String two) -> two.length() - one.length());
        System.out.println("Reverse Length: " + String.join(", ", values));

        Arrays.sort(values, (String one, String two) -> one.compareTo(two));
        System.out.println("Alphabetical: " + String.join(", ", values));

        Arrays.sort(values, (String one, String two) -> {
            if (one.toLowerCase(Locale.ROOT).contains("e") && one.toLowerCase(Locale.ROOT).contains("e")) {
                return one.length() - two.length();
            } else if (one.toLowerCase(Locale.ROOT).contains("e")) {
                return one.length();
            } else if (two.toLowerCase(Locale.ROOT).contains("e")) {
                return one.length();
            } else {
                return one.length() - two.length();
            }
        });
        System.out.println("Alphabetical: " + String.join(", ", values));
    }
}
