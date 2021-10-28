package jb5.assignment2;

import java.util.Scanner;

public class PartOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        PerformOperation odd = (int n) -> n % 2 != 0;
        PerformOperation prime = (int n) -> {
            if (n == 1) return true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
        PerformOperation palindrome = (int n) -> {
            String original = Integer.toString(n);
            String reverse = "";

            for (int i = original.length() - 1; i >= 0; i--) {
                reverse += original.charAt(i);
            }

            return reverse.equals(original);
        };

        int cases = in.nextInt();
        in.nextLine();
        String results = "\n";
        for (int i = 0; i < cases; i++) {
            String line = in.nextLine();
            String[] values = line.split("\\s+");
            results += switch (Integer.parseInt(values[0])) {
                case 1 -> (odd.checker(Integer.parseInt(values[1]))) ? "ODD" : "EVEN";
                case 2 -> (prime.checker(Integer.parseInt(values[1]))) ? "PRIME" : "COMPOSITE";
                case 3 -> (palindrome.checker(Integer.parseInt(values[1]))) ? "PALINDROME" : "NOT PALINDROME";
                default -> "NOT VALID";
            } + "\n";
        }
        
        System.out.print(results);
    }
}
