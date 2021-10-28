package jb4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class AssignmentThree {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Runnable produce = new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        synchronized (list) {
                            while (list.size() == 5)
                                list.wait();

                            int num = ThreadLocalRandom.current().nextInt(1, 101);;
                            System.out.println(num + " has been added to the list");

                            list.add(num);
                            list.notify();
                            Thread.sleep(1000);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable consume = new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        synchronized (list) {
                            while (list.size() == 0)
                                list.wait();

                            int num = list.remove(0);
                            System.out.println(num + " has been removed from the list");

                            list.notify();
                            Thread.sleep(1000);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        try {
            Thread producer = new Thread(produce);
            Thread consumer = new Thread(consume);

            producer.start();
            consumer.start();

            producer.join();
            consumer.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
