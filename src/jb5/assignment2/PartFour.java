package jb5.assignment2;

import java.util.StringJoiner;

public class PartFour {
    public static void main(String[] args) {
        String[] first = {"ax", "bb", "cx"};
        String[] second = {"xxax", "xbxbx", "xxcx"};
        String[] third = {"x"};

        StringOperation remove = (String[] list) -> {
            String[] temp = new String[list.length];
            for (int i = 0; i < list.length; i++) {
                temp[i] = list[i].replaceAll("x", "");
            }
            return temp;
        };

        System.out.println("[" + String.join(", ", first) + "] -> [" + String.join(", ", remove.noX(first)) + "]");
        System.out.println("[" + String.join(", ", second) + "] -> [" + String.join(", ", remove.noX(second)) + "]");
        System.out.println("[" + String.join(", ", third) + "] -> [" + String.join(", ", remove.noX(third)) + "]");
    }
}
