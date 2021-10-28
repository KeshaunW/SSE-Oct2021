package jb5.assignment2;

import java.util.StringJoiner;

public class PartTwoAndThree {
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
        NumberOperation doubling = (int[] nums) -> {
            int[] j = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                j[i] = nums[i] * 2;
            }
            return j;
        };

        System.out.println("Original: " + displayArray(first));
        System.out.println("Last Digit: " + displayArray(last.doMath(first)));
        System.out.println("Doubled: " + displayArray(doubling.doMath(first)) + "\n");

        System.out.println("Original: " + displayArray(second));
        System.out.println("Last Digit: " + displayArray(last.doMath(second)));
        System.out.println("Doubled: " + displayArray(doubling.doMath(second)) + "\n");

        System.out.println("Original: " + displayArray(third));
        System.out.println("Last Digit: " + displayArray(last.doMath(third)));
        System.out.println("Doubled: " + displayArray(doubling.doMath(third)) + "\n");
    }

    private static String displayArray(int[] arr) {
        StringJoiner display = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            display.add("" + arr[i]);
        }
        return display.toString();
    }
}
