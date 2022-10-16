package _16JavaDocs;

/**
 * <h1>ermapsh Calculator</h1>
 * <h2>this class is demonstrated what javadoc is, and it is used in java industry</h2>
 *
 * @author ErMapsh (LearnErMapsh)
 * @version 0.1
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html" target="_blank">HashMap</a>
 * @since 2000
 */


public class Calculator {

    int x;
    int y;

    public static void main(String[] args) {

    }

    public int add() {
        /*
            return addition of 2 numbers
         */
        return x + y;
    }

    public int add(int x, int y) {
         /*
            return addition of 2 numbers
         */
        this.x = x;
        this.y = y;
        return x + y;
    }

    public int sub() {
         /*
            return subtraction of 2 numbers
         */
        return x - y;
    }

    public int sub(int x, int y) {
        /*
            return subtraction of 2 numbers
         */
        this.x = x;
        this.y = y;
        return x - y;
    }

    public int mul() {
        /*
            return multiplication of 2 numbers
         */
        return x * y;
    }

    public int mul(int x, int y) {
        /*
            return multiplication of 2 numbers
         */
        this.x = x;
        this.y = y;
        return x * y;
    }

    public int div() {
        /*
            return div of 2 numbers
         */
        return x / y;
    }

    public int div(int x, int y) {
        /*
            return div of 2 numbers
         */
        this.x = x;
        this.y = y;
        return x / y;
    }
}
