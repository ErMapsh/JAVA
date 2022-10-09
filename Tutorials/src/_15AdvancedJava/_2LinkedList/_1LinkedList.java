package _15AdvancedJava._2LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class _1LinkedList {
    public static void main(String[] args) {

        // There are lots of info in documentation, check out
        LinkedList<Integer> L1 = new LinkedList<>();

        //----1.Inserting element
        L1.add(0);
        L1.add(1);
        L1.add(2);
        L1.add(3);
        L1.add(0, 4);
        System.out.println("1. List1: " + L1.clone());

        //----2.addAll
        LinkedList<Integer> L2 = new LinkedList<>();
        L2.addAll(L1);
        System.out.println("2. List2 after copying all element from List1: " + L2.clone());

        //----3.addFirst
        L2.addFirst(12);
        System.out.println("3. List2 after element adding to start: " + L2.clone());

        //----4.addLast
        L2.addLast(24);
        System.out.println("4. List2 after element adding to end: " + L2.clone());

        //----5.Clear
        L1.clear();
        System.out.println("5. List1 after clearing: " + L1.clone());

        //----6.clone
        System.out.println("6. List2 using clone(): " + L2.clone());

        //----7.contains
        System.out.println("7. 24 is present in List2: " + L2.contains(24));

        //----8.descending Iterator returns Iterator object
        System.out.print("8. In descending (return Iterator Object): ");
        for (Iterator<Integer> it = L2.descendingIterator(); it.hasNext(); ) {
            int i = it.next();
            System.out.print(i + " ");
        }
        System.out.println();

        // ---9.Element and getFirst
        System.out.println("9. First element of List2: " + L2.element() + "\t Using getFirst: " + L2.getFirst() + "\t Using Peek: " + L2.peek());


        // ----10. accessing element by index
        System.out.println("10. 3rd index value of List:  " + L2.get(3));

        // ----11. accessing Last element of List using getLast()
        System.out.println("11. Last element of List2: " + L2.getLast());

        // ----12. offer() offerLast()
        L2.offer(499);
        System.out.println("12. Inserts the specified element at the end of this list using offer(), offerLast(): " + L2.clone());

        // ---12.1 offerFirst()
        L2.offerFirst(2000);
        System.out.println("12.1 Inserts the specified element at the First of this list using  offerFirst(): " + L2.clone());

        // ---13. peekFirst, peek
        System.out.println("13. Retrieves, but does not remove, the head (first element) of this list using peekFirst(), peek(): " + L2.peek() + " " + L2.peekFirst());

        // ----13.1 peekLast()
        System.out.println("13.1 Retrieves, but does not remove, the tail (last element) of this list using peekLast: " + L2.peekLast());

        // -----14. poll(), pollFirst()
        L2.poll();
        System.out.println("14. Retrieves and removes the head (first element) of this list2 using poll() and pollFirst(): " + L2.clone());

        // -----14.1 pollLast()
        L2.pollLast();
        System.out.println("14.1 Retrieves and removes the last element of this list, or returns null if this list is empty using pollLast(): " + L2.clone());
    }
}
