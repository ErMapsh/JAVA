package practice;

public class _7Methods {
    public static void main(String[] args) {
        System.out.println("----Practice On Methods----");
        // multiplicationTable(5);
        // Pattern(5);
        // patterRec(5);
        sumOfFirstNaturalNumber(5);
        System.out.println(RecsumOfFirst(5));
        //System.out.println(RecSumOfFirstNN(5));
        // reversePattern(5);
        // System.out.println(varARG(1, 3, 5, 6, 3, 2, 29));
    }

    static void multiplicationTable(int x){
        for (int i = 0; i < 10; i++) {
            System.out.format("%d * %d = %d\n", x, i, x*i);
        }
    }

    static void Pattern(int x){
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void patterRec(int n){
        if(n>0){
            patterRec(n-1);
            for (int i = 0; i < n; i++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void sumOfFirstNaturalNumber(int x){
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum += i;
        }

        System.out.println(sum);
    }

    static int RecsumOfFirst(int x){
        if (x == 1){
            return 1;
        }else{
            return x + RecSumOfFirstNN(x-1);
        }
    }

    static int RecSumOfFirstNN(int x){
        if(x == 1){
            return 1;
        }else{
            return x + RecSumOfFirstNN(x-1); 
        }
    }

    static void reversePattern(int x){
        for (int i = x; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static int varARG(int ...a){
        int sum = 0;
        for (int element : a) {
            sum += element;
        }
        return sum;
    }

    static int tempIntoFer(int x){
        return (x * (9/5)) + 32;
    }
}