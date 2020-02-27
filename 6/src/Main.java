/**
 * The Main class to use the Rational class
 * *
 * @author Erfan
 * @version 1
 */
public class Main {

    // the main method
    public static void main(String[] args) {

        // make some Rational number
        Rational one = new Rational(-2,5) ;
        Rational two = new Rational(0 ,-4) ;
        Rational three = new Rational() ;

        // use  the mult method
        three.mult( one , two );

        // print the mult
        three.printFraction();
        three.printFloat();
    }
}
