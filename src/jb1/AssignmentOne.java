package jb1;

public class AssignmentOne {
    public static void main(String[] args) {
        String[] one = {"*", "**", "***", "****", "........."};
        String[] two = {"     *", "    ***", "   *****", "  *******", "..........."};

        AssignmentOne.print(one, 1);
        AssignmentOne.print(two, 3);
    }

    private static void print(String[] array, int first) {
        System.out.println(first + ")");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println((first+1) + ")");
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == array.length - 1)
                System.out.println(array[i] + ".");
            else
                System.out.println(array[i]);
        }
    }
}
