/**
 * Created by Lizzi on 17.10.2016.
 */
public class MyComplex {
    private double real;
    private double imaginary;

    public MyComplex() {

        this.real = 0.0;

        this.imaginary = 0.0;
    }

    @Override
    public String toString() {
        if(imaginary>0)
        { return "(" + real + "+" +
                imaginary + "i)";}
        else
        return "(" + real +
                imaginary + "i)";

    }

    public MyComplex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public void setValue(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public boolean isReal() {
        if (real == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isImaginary() {
        if (imaginary == 0) {
            return false;
        } else {
            return true;
        }
    }


    public boolean equals(double real, double imaginary) {
        if ((this.real == real) && (this.imaginary == imaginary)) {
            return true;
        } else {
            return false;
        }

    }

    public boolean equals(MyComplex another) {
        if ((this.real == another.getReal()) && (this.imaginary == another.getImaginary())) {
            return true;
        } else {
            return false;
        }

    }

    public double magnitude() {
        return Math.sqrt(Math.pow(this.imaginary, 2) + Math.pow(this.real, 2));
    }

    public double argument() {
        if (real > 0) {
            return Math.atan(imaginary / real);
        } else if ((real < 0) && (imaginary >= 0)) {
            return Math.PI + Math.atan(imaginary / real);
        } else if ((real < 0) && (imaginary < 0)) {
            return -Math.PI + Math.atan(imaginary / real);
        } else if ((real == 0) && (imaginary > 0)) {
            return Math.PI / 2;
        } else {
            return -Math.PI / 2;
        }

    }
    public MyComplex add(MyComplex right)
    { this.real=this.real+right.getReal();
        this.imaginary=this.imaginary+right.getImaginary();
        return this;}

    public MyComplex addNew(MyComplex right)
    { MyComplex newcomplex= new MyComplex();
        newcomplex.setReal(this.real+right.getReal());
        newcomplex.setImaginary(this.imaginary+right.getImaginary());
        return newcomplex;}
    public MyComplex subtract(MyComplex right)
    { this.real=this.real-right.getReal();
        this.imaginary=this.imaginary-right.getImaginary();
        return this;}

    public MyComplex subtractNew(MyComplex right)
    { MyComplex newcomplex= new MyComplex();
        newcomplex.setReal(this.real-right.getReal());
        newcomplex.setImaginary(this.imaginary-right.getImaginary());
        return newcomplex;}
    public MyComplex multiply(MyComplex right) {
        this.real=this.real*right.getReal()-this.imaginary*right.getImaginary();
        this.imaginary=this.imaginary+this.real*right.getImaginary();
        return this;}
    public MyComplex conjugate()
    {
        MyComplex conjcomplex= new MyComplex();
        conjcomplex.setReal(this.real);
        conjcomplex.setImaginary(-this.getImaginary());
        return conjcomplex;
    }
    public MyComplex divide(MyComplex right){

        this.real=(this.real*right.getReal()+this.imaginary*right.getImaginary())/(Math.sqrt(right.getImaginary())+Math.sqrt(right.getReal()));
        this.imaginary=(this.imaginary*right.getReal()-this.real*right.getImaginary())/(Math.sqrt(right.getImaginary())+Math.sqrt(right.getReal()));


        return this;
    }
}
