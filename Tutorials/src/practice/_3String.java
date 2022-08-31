package practice;

public class _3String {
    public static void main(String[] args) {
        /* 1. Covert a string into lowercase

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        System.out.println(str.toLowerCase());
        */

        /* 2. replace a space from string

        String str1 = "Trim the space";
        System.out.println(str1.trim());
        */

        /* 3. write a program to fill a letter in string

        String str2 = "Dear <Name>, Thanks a lot";
        System.out.println(str2.replace("<Name>", "ErMapsh"));
        */

        /* 4.detect double and triple white spaces in string

        String MyString = "This string contain  double space and   triple space";
        System.out.println("double space at " + MyString.indexOf("  "));
        System.out.println("triple space at " + MyString.indexOf("   "));
        System.out.println("fourth space at " + MyString.indexOf("    "));// if -1 means unsuccessful
        */

        /* 5.Write a program to format the following letter using escape sequence character

        String Letter = "Dear ErMapsh, \n\tYour Gameplay make a sense\nThank you";
        System.out.println(Letter);
        */

    }
}
