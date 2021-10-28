package jb5.assignment1.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PartTwo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(32);
        numbers.add(293);
        numbers.add(2983);
        numbers.add(10);
        numbers.add(44);
        numbers.add(3);

        System.out.println(getListString(numbers));
    }

    private static String getListString(List<Integer> list) {
        return list.stream().map(i -> i % 2 == 0 ? "e" + i : "o" + i).collect(Collectors.joining(","));
    }
}
