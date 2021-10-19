package jb2;

import java.util.StringJoiner;
import java.util.concurrent.ThreadLocalRandom;

public class AssignmentTwo {
    public static void main(String[] args) {
        int size = ThreadLocalRandom.current().nextInt(3, 7);
        int[][] testArray = new int[size][size];

        for (int i = 0; i < testArray.length; i++) {
            StringJoiner display = new StringJoiner(", ", "[", "]");
            for (int j = 0; j < testArray[i].length; j++) {
                testArray[i][j] = ThreadLocalRandom.current().nextInt(1, 101);
                display.add("" + testArray[i][j]);
            }
            System.out.println(display);
        }

        int[] values = AssignmentTwo.getMaxNumber(testArray);
        System.out.println("\nThe maximum value is " + values[0] + ", found at [" + values[1] + "],[" + values[2] + "].");
    }

    public static int[] getMaxNumber(int[][] array) {
        int max = 0, x = 0, y = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    x = i;
                    y = j;
                }
            }
        }

        int[] value = {max, x, y};
        return value;
    }
}
