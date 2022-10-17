package _16JavaDocs;
//https://docs.oracle.com/javase/8/docs/api/javax/swing/text/html/package-use.html

/**
 * This n new class that I'm building
 * <H1>The second tutorial of CWH</H1>
 *
 * @author ErMapsh
 * @version 0.2
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html" target="_blank">HashMap</a>
 * @since 2000
 */


public class _2BuildingDoc {
    int x;
    int y;

    /**
     * this is main method to setting up x and y
     *
     * @param x the first element to set a
     * @param y the second element to set b
     */
    public void main(int x, int y) {
        this.x = x;
        this.y = y;
        div();
    }


    /**
     * take two param and return sum of them
     *
     * @param x the first number to add
     * @param y the second number to add
     * @return sum of x and y as an integer
     */

    public int add(int x, int y) {

        return x + y;
    }

    /**
     * take two param and return sub of them
     *
     * @param x the first number to sub
     * @param y the second number to sub
     * @return sub of x and y as an integer
     */

    public int sub(int x, int y) {
        return x - y;
    }

    /**
     * take two non-zero param and return mul of them
     *
     * @param x the first number to mul
     * @param y the second number to mul
     * @return mul of x and y as an integer
     * @throws ArithmeticException if is one of the element is 0
     */

    public int Mul(int x, int y) throws ArithmeticException {
        if (x == 0 || y == 0) {
            throw new ArithmeticException();
        }
        return x * y;
    }


    /**
     * take two non-zero param and return div of them
     *
     * @param x the first number
     * @param y the second number
     * @return div of x and y as an integer
     * @throws ArithmeticException if is one of the element is 0
     */
    public int div(int x, int y) throws ArithmeticException {
        if (x == 0 || y == 0) {
            throw new ArithmeticException();
        }
        return x / y;
    }

    /**
     * @return div of x and y as an integer
     * @throws ArithmeticException if is one of the element is 0
     * @deprecated This method is decrypted use instead div(int x, int y) method
     */
    public int div() throws ArithmeticException {
        if (this.x == 0 || this.y == 0) {
            throw new ArithmeticException();
        }
        return this.x / this.y;
    }
}
