package _6Array;

public class _1Array{
    public static void main(String[] args) {
        System.out.println("----Array----");
        /* we have to store marks of 500 student
            1. create 500 var
            2. create array of size 500(recommended)
        */

        // there are 3 ways to create an array in Java
        
        int [] marks; // declaration;
        marks = new int[5]; // Memory allocation;

        int [] SubId = new int[5]; // declaration + Memory allocation;

        int [] NewMarks = {100, 70, 80, 32, 98}; // declaration and initialize;

        for (int i = 0; i < NewMarks.length; i++) {
            System.out.println(NewMarks[i]);
        }


    }
}
