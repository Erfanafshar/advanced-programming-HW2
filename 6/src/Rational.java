/**
 * The Rational class can do some mathematics operator for Rational numbers
 * It holds the numerator and denominator of the Rational number in the simplest model
 * *
 * @author Erfan
 * @version 1
 */
public class Rational {

    // field

    // The numerator of the rational number
    private int numerator ;

    // The denominator of the rational number
    private int denominator ;

    // The GCD of numerator and denominator of the rational number
    private int gcd ;

    // constuctor //

    /**
     * Create a new Rational number with given numerator and denominator
     * *
     * @param sorat the numerator of the rational number
     * @param makhraj the denominator of the rational number
     */
    public Rational ( int sorat , int makhraj ){
        gcd = findGcd( sorat , makhraj );
        numerator = sorat / gcd ;
        denominator = makhraj / gcd ;
    }

    /**
     * Create a default Rational number if there is not any initialization
     * *
     */
    public Rational (){
        numerator = 1 ;
        denominator = 2 ;
    }

    // method //

    /**
     * Get the numerator of the rational number
     * @return numerator field
     */
    public int getNumerator() {
        return numerator ;
    }

    /**
     * Set the numerator of the rational number
     * @param sorat set numerator
     */
    public void setNumerator ( int sorat ){
        numerator = sorat ;
    }

    /**
     * Get the denominator of the rational number
     * @return denominator field
     */
    public int getDenominator(){
        return denominator ;
    }

    /**
     * Set the denominator of the rational number
     * @param makhraj set denominator
     */
    public void setDenominator ( int makhraj ){
        denominator = makhraj ;
    }

    /**
     * Sum of two rational number
     * @param one first rational number
     * @param two twice rational number
     */
    public void add( Rational one , Rational two ){
       int sorat = ( one.numerator * two.denominator ) + ( two.numerator * one.denominator) ;
       int makhraj = ( one.denominator * two.denominator) ;
       gcd = findGcd( sorat , makhraj ) ;
       numerator = sorat / gcd ;
       denominator = makhraj / gcd ;
    }

    /**
     * Sub of two rational number
     * @param one first rational number
     * @param two twice rational number
     */
    public void sub ( Rational one , Rational two ){
        int sorat = ( one.numerator * two.denominator ) - ( two.numerator * one.denominator) ;
        int makhraj = ( one.denominator * one.numerator ) ;
        gcd = findGcd( sorat , makhraj ) ;
        numerator = sorat / gcd ;
        denominator = makhraj / gcd ;
    }

    /**
     * Multiplication of two rational number
     * @param one first rational number
     * @param two twice rational number
     */
    public void mult ( Rational one , Rational two ) {
        int sorat = ( one.numerator * two.numerator ) ;
        int makhraj = ( one.denominator * two.denominator ) ;
        gcd = findGcd( sorat , makhraj ) ;
        numerator = sorat / gcd ;
        denominator = makhraj  / gcd ;
    }

    /**
     * Division of two rational number
     * @param one first rational number
     * @param two twice rational number
     */
    public void div ( Rational one , Rational two ){
        int sorat = ( one.numerator * two.denominator ) ;
        int makhraj = ( one.denominator * two.numerator ) ;
        gcd = findGcd( sorat , makhraj ) ;
        numerator = sorat / gcd ;
        denominator = makhraj / gcd ;
    }

    /**
     * Print the rational number in fraction model
     */
    public void printFraction () {
        System.out.println ( numerator + "/" + denominator ) ;
    }

    /**
     * Print the rational number in float model
     */
    public void printFloat (){
        //numerator = ( float ) numerator ;
        float res = (float) numerator/denominator ;
        System.out.println(res);
    }

    /**
     * Find the GCD of two number
     * @param a the first number
     * @param b the twice number
     * @return gcd field
     */
    public int findGcd ( int a , int b ){
        int temp ;
        if ( a < 0){
            a = -a;
        }
        if ( b < 0){
            b = -b;
        }
        if ( a==0 || b==0 ){
            gcd = 1 ;
        } else {
            if ( b > a ){
                temp = b ;
                b = a ;
                a = temp ;
            }
            for ( int i = b ; i > 0 ; i-- ){
                if ( a % i == 0 && b % i == 0){
                    gcd = i ;
                    break ;
                }
            }
        }
        return gcd ;
    }

}
