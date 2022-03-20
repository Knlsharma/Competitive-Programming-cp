package Recursion;

/**
 * @author Kunal Sharma at 11/02/22 10:08 PM
 */
public class Recursion {

    public static void main(String[] args) {
        System.out.println(myPow(2.10000, 3));
    }

    public static double myPow(double x, int n) {

        if (n == 0)
            return 1;
        if (n < 0) {
            return 1 / x * myPow(1 / x, -(n + 1));
        }
        return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }

}

