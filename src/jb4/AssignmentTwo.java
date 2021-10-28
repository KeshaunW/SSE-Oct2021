package jb4;

public class AssignmentTwo {
    private static final Integer num1 = 20;
    private static final Integer num2 = 400;

    public static void main(String[] args) {
        Thread t1 = new Thread("Thread #1") {
            public void run() {
                System.out.println(this.getName() + " has started.");
                try {
                    synchronized (num1) {
                        Thread.sleep(100);
                        synchronized (num2) {
                            System.out.println(num1 * num2);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(this.getName() + " has ended.");
            }
        };

        Thread t2 = new Thread("Thread #2") {
            public void run() {
                System.out.println(this.getName() + " has started.");
                try {
                    synchronized (num2) {
                        Thread.sleep(100);
                        synchronized (num1) {
                            System.out.println(num2 / num1);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(this.getName() + " has ended.");
            }
        };

        t1.start();
        t2.start();
    }
}
