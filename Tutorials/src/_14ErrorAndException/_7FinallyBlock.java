package _14ErrorAndException;

public class _7FinallyBlock {
    public static int normal(int a, int b) {
        try {
            // somethime we have to do some work, after retun something that time we can use finally block,
            // it's even run after return
            int c = a / b;
            return c;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception ");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally its happen and cleanup done");
        }
        return -1;
    }

    public static int task() {
        for (int i = 0; i < 5; i++) {
            try {
                if (i == 2) {
                    // Yaha pe for loop break ho raha hai phir bhi vo finally run ho raha hai,
                    // because of try, catch, finally block
                    break;
                }
            } finally {
                System.out.println("finally we reach at the end with " + i);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(normal(5, 0));
        System.out.println(normal(15, 5));
        
        System.out.println();
        System.out.println(task());
    }
}
