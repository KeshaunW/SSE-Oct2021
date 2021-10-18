package jb1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AssignmentTwo {
    public static void main(String[] args) {
        int number = ThreadLocalRandom.current().nextInt(1, 101);

        int guesses = 0;
        boolean close = false;

        Scanner in = new Scanner(System.in);

        while (!close && guesses < 5) {
            System.out.print("Please guess a number between 1 and 100: ");

            int guess = in.nextInt();
            guesses++;

            if (guess >= number - 10 && guess <= number + 10) {
                System.out.println("Nice! The number was " + number + "!");
                close = true;
            } else {
                System.out.println("Sorry! Please try again!");
            }
        }

        if (guesses == 5 && !close) {
            System.out.println("Sorry! The number was " + number + "!");
        }
    }
}
