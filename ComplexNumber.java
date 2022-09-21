//Create the method conjugate() in class Complex, which turns a complex number to
//its conjugate.
// Create the method reciprocate() as well, which turns the complex
//number to its reciprocal.
// Implement the div(c) method, which divides the complex
//number with the other complex number c provided as a parameter.

import static java.lang.Math.sqrt;

public class ComplexNumber {
    double x;
    double img;

    //void Complex(){}

    void ComplexNumber(double x,double y){
        this.x = x;
        this.img = y;
        if (this.img < 0)
            System.out.println(x+""+y+"i is created!");
        else
            System.out.println(x+"+"+y+"i is created!");
    }

    public void conjugate(ComplexNumber cmplx){
        if (cmplx.img < 0)
            System.out.println("Its conjugate = "+cmplx.x +""+cmplx.img+"i");
        else
            System.out.println("Its conjugate = "+cmplx.x +"-"+cmplx.img+"i");
    }


    public void reciprocate(ComplexNumber cmplx){
        double z = sqrt(x*x + img*img);
        if (cmplx.img > 0)
            System.out.println("("+ cmplx.x+"/"+z*z+ ")" +"-" + "("+cmplx.img+"/"+z*z+")i");
        else
            System.out.println("("+ cmplx.x+"/"+z*z+ ")" +"+" + "("+cmplx.img+"/"+z*z+")i");

    }

    public void div(ComplexNumber c){
        if (c.img > 0) {
            double ii = -(img * -(c.img));
            double a = x * c.x + ii;
            double b = x * (-c.img) + img * c.x;
            double z = sqrt(c.x * c.x + c.img * c.img);
            System.out.println(a + "+ (" + b + ")i/" + z * z);
        }
        else {
            double a = x * c.x - img * (c.img);
            double b = x * (c.img) + img * c.x;
            double z = sqrt(c.x * c.x + c.img * c.img);
            System.out.println(a + "+ (" + b + ")i/" + z * z);
        }
    }



}
