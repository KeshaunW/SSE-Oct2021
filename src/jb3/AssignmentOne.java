package jb3;

import java.io.File;

public class AssignmentOne {
    public static void main(String[] args) {
        File directory = new File("resources/");
        listDirFiles(directory, 0);
    }

    public static void listDirFiles(File directory, int level) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                for (int i = 0; i < level; i++) {
                    System.out.print("\t");
                }
                if (file.isDirectory()) {
                    System.out.println(file.getName() + "/");
                    listDirFiles(file, level+1);
                } else {
                    System.out.println(file.getName());
                }
            }
        }
    }
}
