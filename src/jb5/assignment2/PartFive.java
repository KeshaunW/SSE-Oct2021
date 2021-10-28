package jb5.assignment2;

import java.util.StringJoiner;

public class PartFive {
    public static void main(String[] args) {
        int[] test = {2, 4, 4, 8};

        System.out.println("Array: " + displayArray(test) + "; Target: 14 -> " + groupSumClump(0, test, 14));
    }

    private static boolean groupSumClump(int start, int[] nums, int target) {
        if(start >= nums.length)
            return target == 0;

        int i;
        int sum = 0;

        for (i = start; i < nums.length && nums[start] == nums[i]; i++) {
            sum += nums[i];
        }

        return groupSumClump(i, nums, target - sum) || groupSumClump(i, nums, target);
    }

    private static String displayArray(int[] arr) {
        StringJoiner display = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            display.add("" + arr[i]);
        }
        return display.toString();
    }
}
