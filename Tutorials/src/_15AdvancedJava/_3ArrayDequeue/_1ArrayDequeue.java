package _15AdvancedJava._3ArrayDequeue;

import java.util.ArrayDeque;

public class _1ArrayDequeue {
    public static void main(String[] args) {

        /*
        https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/ArrayDeque.html

        https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/Deque.html
        */

        ArrayDeque<Integer> ad = new ArrayDeque<>(); // default capacity of dequeue
        //1. clone
        System.out.println("1. Empty queue: " + ad.clone());

        //2. inserting element
        ad.add(1);
        ad.add(2);
        ad.add(3);
        ad.add(4);
        System.out.println("2. After Insertion: " + ad.clone());

        //3.inserting at first and last
        ad.addFirst(4);
        ad.addLast(99);
        System.out.println("3. After inserting element at first and last: " + ad.clone());

        // 4. creating new queue using previous queue
        ArrayDeque<Integer> ad1 = new ArrayDeque<>(ad);
        System.out.println("4. After using addAll queue2 is: " + ad1.clone());

        // 5.clear
        ad.clear();
        System.out.println("5. After clearing first queue: " + ad.clone());

        // 6.getFirst and getLast
        System.out.println("6. getFirst and getLast is " + ad1.getFirst() + "," + ad1.getLast());

    }
}
