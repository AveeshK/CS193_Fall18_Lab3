public class MathUtils {
    /**
     * divideNumbers -- a / b
     * Divide a by b and return the result
     */
    public static double divideNumbers(int dividend, int divisor) {
        /* Do some casual division ... Super easy ... Shouldn't be any problems here */
        double res = (double)dividend / divisor;
        /* Return the DEFINITELY CORRECT result */
        return res;
    }

    /**
     * raiseToPower -- (base)^(exp)
     * Raise the number base to power exp
     */
    public static double raiseToPower(int base, int exp) {
        return Math.pow(base, exp);
    }    
}