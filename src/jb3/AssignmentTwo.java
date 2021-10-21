package jb3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class AssignmentTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter something to add to the file: ");
        String value = in.nextLine();

        try {
            Files.write(Paths.get("resources/input.txt"), (value + "\n").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
