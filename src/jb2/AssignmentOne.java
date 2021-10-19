package jb2;

import java.util.Scanner;

public class AssignmentOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;
        int value = 1;

        System.out.println("Input integers that you would like to add together. When you are done inputting integers, enter 0 to see your total.");

        while (value != 0) {
            value = in.nextInt();
            total += value;
        }

        System.out.println("Total: " + total);
    }
}
