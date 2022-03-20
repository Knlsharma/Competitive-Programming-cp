package Recursion;

/**
 * @author Kunal Sharma at 12/02/22 6:03 PM
 */
public class Fraction {

    private static int numerator;
    private static int denominator;

    public Fraction(int numerator, int denominator) throws Exception {
        this.numerator = numerator;
        if (denominator == 0) {
            throw new Exception("Denominator can't be Zero");
        }
        this.denominator = denominator;
        simplify();
    }


    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int n) {
        this.numerator = n;
        simplify();
    }


    public void setDenominator(int d) throws Exception {
        if (d == 0) {
            throw new Exception("Denominator can't be Zero");
        }
        this.denominator = d;
        this.simplify();
    }

    public void print() {
        if (denominator == 1) {
            System.out.println(numerator);
        } else {
            System.out.println(numerator + "/" + denominator);
        }


    }

    private static void simplify() {
        int gcd = 1;

        int smaller_num = Math.min(numerator, denominator);
        for (int i = 2; i < smaller_num; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    public static Fraction add(Fraction f1, Fraction f2) throws Exception {

        int neum = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
        int denom = f2.denominator + f1.denominator;
        Fraction fraction = new Fraction(neum, denom);
        simplify();
        return fraction;
    }

    public Fraction add(Fraction f2) throws Exception {

        this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
        this.denominator = f2.denominator + this.denominator;
        simplify();
        return this;
    }

    public void multiply(Fraction f2) throws Exception {
        int mul_deno = this.getDenominator() * f2.getDenominator();
        int mul_newm = this.getNumerator() * f2.getNumerator();
        this.setDenominator(mul_deno);
        this.setNumerator(mul_newm);
        simplify();
    }


}
