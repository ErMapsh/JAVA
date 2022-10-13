package practice._15AdvancedJava;

import java.util.ArrayList;

public class _1ArrayList {
    public static void main(String[] args) {

        ArrayList<String> StudentName = new ArrayList<>(40);

        // appending element
        StudentName.add("Mahesh");
        StudentName.add("ErMapsh");
        StudentName.add("MAPSH");
        StudentName.add(0, "Durgesh");

        System.out.println("---\n");
        System.out.println(StudentName);
        for (Object o : StudentName) {
            System.out.println(o);
        }
        System.out.println("---\n");

        System.out.println("array size" + StudentName.size());

        // removing element
        System.out.println(StudentName.isEmpty());
        StudentName.remove("Durgesh");
        StudentName.remove(2);
        System.out.println(StudentName);


    }
}
