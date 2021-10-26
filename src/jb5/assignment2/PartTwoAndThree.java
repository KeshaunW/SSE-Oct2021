package jb5.assignment2;

import java.util.StringJoiner;
import java.util.concurrent.ThreadLocalRandom;

public class PartTwo {
    public static void main(String[] args) {
        int[] first = {1, 22, 93};
        int[] second = {16, 8, 886, 8, 1};
        int[] third = {10, 0};

        NumberOperation last = (int[] nums) -> {
            int[] j = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                j[i] = nums[i] % 10;
            }
            return j;
        };

        System.out.println("Original: " + displayArray(first));
        System.out.println("After: " + displayArray(last.doMath(first)) + "\n");

        System.out.println("Original: " + displayArray(second));
        System.out.println("After: " + displayArray(last.doMath(second)) + "\n");

        System.out.println("Original: " + displayArray(third));
        System.out.println("After: " + displayArray(last.doMath(third)) + "\n");
    }

    public static String displayArray(int[] arr) {
        StringJoiner display = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            display.add("" + arr[i]);
        }
        return display.toString();
    }
}
