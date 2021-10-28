package jb5.assignment1.lambda;

public class Utils {
    public static int sortE(String one, String two) {
        int a = 0;
        int b = 0;

        for (int i = 0; i < one.length(); i++) {
            if (one.toLowerCase().charAt(i) == 'e')
                a++;
        }

        for (int j = 0; j < two.length(); j++) {
            if (two.toLowerCase().charAt(j) == 'e')
                b++;
        }

        return b - a;
    }
}
