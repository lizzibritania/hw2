/**
 * Created by Юля on 18.10.2016.
 */
public class MyPolynomial {
    double[] coeffs;

    public MyPolynomial()

    {
        this.coeffs = new double[0];
    }

    public MyPolynomial(double... coeffs)

    {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public String toString() {
        String tostr = "";
        int n = coeffs.length - 1;
        for (int i = 0; i < coeffs.length - 1; i++) {
            tostr += coeffs[n] + "x^" + n + "+";
            n = n - 1;
        }
        return tostr + coeffs[n];
    }

    public double evaluate(double x) {
        double eva = 0.0;
        int n = coeffs.length - 1;
        for (int i = 0; i < coeffs.length - 1; i++) {
            eva += coeffs[n] * Math.pow(x, n);
            n = n - 1;
        }
        return eva;

    }

    public MyPolynomial add(MyPolynomial right) {

        double max;
        int i;
        max = (this.getDegree() > right.getDegree()) ? this.getDegree() : right.getDegree();
        int maxplus1 = (int) max + 1;
        double[] add = new double[maxplus1];
        if (this.getDegree() == right.getDegree()) {
            for (i = this.getDegree(); i >= 0; i--)
                add[i] = this.coeffs[i] + right.coeffs[i];
        }

        if (this.getDegree() > right.getDegree()) {
            for (i = this.getDegree(); i > right.getDegree(); i--)
                add[i] = this.coeffs[i];
            for (i = right.getDegree(); i >= 0; i--)
                add[i] = this.coeffs[i] + right.coeffs[i];
        }

        if (this.getDegree() < right.getDegree()) {
            for (i = right.getDegree(); i > this.getDegree(); i--)
                add[i] = right.coeffs[i];
            for (i = this.getDegree(); i >= 0; i--)
                add[i] = this.coeffs[i] + right.coeffs[i];
        }
        MyPolynomial sum = new MyPolynomial(add);
        return sum;
    }

    public MyPolynomial multiply(MyPolynomial right) {

        int i, j, max;
        max = this.getDegree() + right.getDegree();
        double[] mul = new double[max + 1];

        for (i = this.getDegree(); i >= 0; i--)
            for (j = right.getDegree(); j >= 0; j--)
                mul[i + j] += this.coeffs[i] * right.coeffs[j];
        MyPolynomial composition = new MyPolynomial(mul);
        return composition;
    }

}