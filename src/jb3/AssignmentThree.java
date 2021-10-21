package jb3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AssignmentThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Pick a character to search for: ");
        char search = in.next().charAt(0);
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("resources/getcount.txt"))) {
            int ch;
            while ((ch = br.read()) != -1) {
                if (Character.isLetter(ch) && Character.toLowerCase(ch) == Character.toLowerCase(search))
                    count++;
            }
            System.out.println("Total Count of Search(" + search + "): " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
