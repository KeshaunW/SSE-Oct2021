package jb4;

public class AssignmentOne {
    private static volatile AssignmentOne _instance;

    private AssignmentOne() {}

    public static AssignmentOne getInstance() {
        if (_instance == null) {
            synchronized (AssignmentOne.class) {
                if (_instance == null)
                    _instance = new AssignmentOne();
            }
        }
        return _instance;
    }
}
