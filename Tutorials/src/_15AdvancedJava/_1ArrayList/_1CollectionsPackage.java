package _15AdvancedJava._1ArrayList;

import java.util.ArrayList;

public class _1CollectionsPackage {
    public static void display(ArrayList<Integer> al) {
        System.out.println("Size of array is " + al.size());
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println("\n");

        /*
        for (Integer integer : al) {
            System.out.print(integer + " ");
        }
        */
    }

    public static void main(String[] args) {

        /* Generic syntax --->
         *  ArrayList <Datatype> var_name = new ArrayList<>();
         **/


        //----------1.ArrayList----
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(0, 6);
        al.add(0, 7);
        display(al);


        //----------2. Setting up arrayList----------
        ArrayList<Integer> al2 = new ArrayList<>(6);
        al2.add(10);
        al2.add(9);
        al2.add(9);
        al2.add(9);
        al2.add(9);
        al2.add(9);
        al2.add(9); // here I want to add one more item in 6th size of array, that can we do easily
        display(al2);


        //----------3.Copying another arraylist data----
        ArrayList<Integer> al3 = new ArrayList<>();
        al3.addAll(al);
        display(al3);

        // here is another method to copy array
        ArrayList<Integer> sample = new ArrayList<>(al);
        display(sample);

        //----------4. clear method----------
        sample.clear();
        display(sample);

        //------- 5.Element content or not----
        System.out.println("7 is in al3: " + al3.contains(7));
        System.out.println("27 is in al3: " + al3.contains(27) + "\n");

        // -------- 6.indexOf-----
        display(al3);
        System.out.println("element 4 is present at " + al3.indexOf(4));
        System.out.println("element 7 is present at " + al3.indexOf(7));
        System.out.println("element 150 is present at " + al3.indexOf(150) + "\n");

        // ------ 7.lastIndexOf----
        al3.add(2);
        display(al3);
        System.out.println("element 2 from end side is present at " + al3.lastIndexOf(2) + "\n");

        // ----8 remove--
        al3.remove(3);
        display(al3);

        // ---9.setIndex element
        al3.set(3, 3444);
        display(al3);

        // ---- 10.hashCode
        System.out.println("hash for al3: "+al3.hashCode() + "\n");
        
        // --- 11. clone
        System.out.println("al3 array: "+ al3.clone());
    }
}
