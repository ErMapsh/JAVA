package _6Array;

public class _2ForEachLoop {
    public static void main(String[] args) {
        System.out.println("----For Each Loop----");

        int [] marks = {10, 9, 8, 2, 4};
        System.out.println(marks.length);

        float [] floatMarks = {2.3f, 4.5f, 3.5f, 3.2f, 9.3f};

        String [] Student = {"Er", "Mapsh", "Mahesh", "Mestri"};

        char [] character = {'a', 'f', 'b', 'd'};

        for (int i = 0; i < Student.length; i++) {
            System.out.println(Student[i]);
        }

        /* For each loop--> When we can use this? when we want to get element from array */
        for (String element : Student) {
            System.out.println(element);
        }

    }
}
