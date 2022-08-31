package _3String;

public class _2StringFunctions {
    public static void main(String[] args) {
        String name = "ErMapsh";

        /* System.out.printf("Original string is %s\n",name);
         System.out.printf("return the length of string is %d\n",name.length());
         System.out.println("string to LowerCase is " + name.toLowerCase());
         System.out.println("string to UpperCase is " + name.toUpperCase());
        */

        /*  String name1 = "  Mahesh  ";
        System.out.println("The string have whitespace: "+ name1);
        System.out.println("Removing whitespace using trim(): "+ name1.trim());
        */

        /*
        // start index with 3 and also mention where to stop
        System.out.println(name.substring(0));// like original string
        System.out.println(name.substring(3));
        System.out.println(name.substring(3, 5));
        */

        /*
        String marsh = name.replace('p', 'r');
        System.out.println(marsh);

        String Mapsh = name.replace("ErMarsh", "ErMapsh");
        System.out.println(Mapsh);
        */

        /*
        System.out.println(name.startsWith("Er"));
        System.out.println(name.endsWith("h"));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf("p",3));
        */

        /*

        // ErMapsh
        System.out.println(name.lastIndexOf('s'));
        System.out.println(name.lastIndexOf("psh"));

        System.out.println(name.lastIndexOf("rMa", 3));
        //return -1(failed) because of is searching in "ErMa" not in "psh"

        System.out.println(name.equals("ErMapsh"));
        System.out.println(name.equalsIgnoreCase("ermapsh"));// ignore case sensitive
        */

        /*
        System.out.print("ErMapsh\n");
        System.out.println("Er\tMapsh");
        System.out.println("\\ErMapsh");
        System.out.println("This is \"ErMapsh");
        */
    }
}
