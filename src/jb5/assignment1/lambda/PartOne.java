package jb5.assignment1;

import java.util.Arrays;
import java.util.Comparator;
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
            int a = 0;
            int b = 0;

            for (int i = 0; i < one.length(); i++) {
                if (one.toLowerCase().charAt(i) == 'e')
                    a++;
            }

            for (int j = 0; j < two.length(); j++) {
                if (two.toLowerCase().charAt(j) == 'e')
                    b++;
            }

            return b - a;
        });
        System.out.println("E first: " + String.join(", ", values));
    }
}
