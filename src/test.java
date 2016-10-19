/**
 * Created by Lizzi on 17.10.2016.
 */
public class test {
    public static void main(String[] args) {

        MyComplex complex = new MyComplex(1, 1);
        System.out.println(complex.toString());
        System.out.println(complex.isReal());
        System.out.println(complex.isImaginary());
        MyComplex complex2 = new MyComplex(1, 1);
        MyComplex complex1 = new MyComplex(1, 2);
        System.out.println(complex.equals(complex2));
        System.out.println(complex.equals(1, 0));
        System.out.println(complex.magnitude());
        System.out.println(complex.argument());
        System.out.println(complex.addNew(complex2).toString());
        System.out.println(complex.add(complex2).toString());
        System.out.println(complex2.multiply(complex).toString());
        System.out.println(complex.conjugate().toString());
        System.out.println(complex.divide(complex1));


        MyPolynomial polinom1 = new MyPolynomial(1, 2, 4, 5, 6, 6, 4);
        System.out.println(polinom1.getDegree());
        System.out.println(polinom1.toString());
        System.out.println(polinom1.evaluate(5));
        MyPolynomial polinom2 = new MyPolynomial(1, 2, 4, 5, 6, 6);
        System.out.println("sum");
        System.out.println(polinom1.add(polinom2).toString());
        System.out.println("composition");
        System.out.println(polinom1.multiply(polinom2).toString());


        Ball ball1=new Ball(1,1,1,1,1);
        System.out.println(ball1.toString());
        ball1.move();
        System.out.println(ball1.toString());
        ball1.reflectHorizontal();
        ball1.reflectVertical();
        System.out.println(ball1.toString());

        Container newcontainer=new Container(3,10,3,5);
        System.out.println(newcontainer.toString());
        System.out.println(newcontainer.getWidth());
        System.out.println(newcontainer.getHeight());
        Ball ball2=new Ball(5,7,1,1,1);
        System.out.println(newcontainer.collides(ball2));
    }
}