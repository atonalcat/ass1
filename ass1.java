
/**
 * Write a description of class ass1 here.
 *
 * @author (Chauncey Li)
 * @version (9/21/2021)
 */
public class ass1
{
    // instance variables - replace the example below with your own
    
    

    /**
     * Constructor for objects of class ass1
     */
    public static void main (String[] args)
    {
         int a, b, c, x1, y1, x2, y2, k; 
        double a1, ak, r;
        // Quadratic Formula
        //leading coefficient
        a = 1;
        //middle coefficient
        b = 5;
        //rightmost coefficient
        c = 6;
        System.out.println("QUADRATIC FORMULA");
        System.out.println("The solutions for " + a + "x^2 + " + b + "x + " + c + " are " + (-b - Math.sqrt(b*b-4*a*c))/(2*a) + " and " + (-b + Math.sqrt(b*b-4*a*c))/(2*a) + ".");
        //Slope Formula
        //x value of first point
        x1 = 0;
        //y value of first point
        y1 = 0;
        //x value of second point
        x2 = 2;
        //y value of second point
        y2 = 3;
        System.out.println();
        System.out.println("SLOPE FORMULA");
        System.out.println("A line connecting the points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") has a slope of " + (double)(y2-y1)/(x2-x1));  
        //Midpoint Formula
        System.out.println();
        System.out.println("MIDPOINT FORMULA");
        System.out.println("The midpoint between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is (" + (double)(x1+x2)/2 + ", " + (double)(y1+y2)/2 + ")"); 
        //Sum of Arithmetic Series
        //starting value
        a1 = 1.0;
        //increase amount
        r = 1.0;
        //number of terms to be calculated
        k = 5;
        //final term
        ak = r*k; 
        ak = (((double)k)/2)*(a1 + ak);
        System.out.println();
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.println("The sum of the first " + k + " terms of an arithmetic series that starts with " + a1);
        System.out.println("and increases by a rate of " + r + " is " + ak);
        //Sum of Finite Geometroic Series
        a1 = 3.0;
        r = 2.0;
        k = 3;
        System.out.println();
        System.out.println("SUM OF A FINITE GEOMETRIC SERIES");
        System.out.println("The sum of the first " + k + " terms of a finite geomteric series that starts with " + a1);
        System.out.print("and increases by a rate of " + r + " is " + a1*((1-Math.pow(r, k))/(1-r)));
    }

    
    
}
