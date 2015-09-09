/*
 * Project: MixedResults.java
 * Description: Playing with Math and Math classes
 * Name:Hanmin Yun
 * Date: Sept 8, 2015
 */

public class MixedResults {
 
  public static void main( String[] args) {
    
    // Print some challenging examples with math
    System.out.println( 3 + 5.0/2 + 5 * 2-3 );
    System.out.println( 3.0 + 5/2 + 5 * 2-3 );
    System.out.println( (int)(3.0 + 5)/(2 + 5.0) * 2-3); // -.2
    
    // initial variables
    double d1 = 37.9;
    double d2 = 1004.128;
    int i1 = 12;
    int i2 = 18;
    
    System.out.println( "Problem 1: " + (57.2 * (i1/i2) + 1) ); // 1.0
    System.out.println( "Problem 2: " + (57.2 * ((double)i1/i2) + 1) ); // 39.13333
    System.out.println( "Problem 3: " + (15 - i1 * (d1 * 3 ) + 4) ); // -1345.39999
    System.out.println( "Problem 4: " + (15 - i1 * (int)(d1 * 3) + 4) ); // -1337
    System.out.println( "Problem 5: " + (15 - i1 * ((int)d1 * 3) + 4) ); // -1313
    
    // Exercises 10-15 page 5-4
    System.out.println( "Exercise 10" );
    int p1 = 3;
    double d3 = 10.3;
    int j1 =  (int)5.9;
    System.out.println( p1 + p1 * (int)d3 - 3 * j1 );
    
    System.out.println( "Exercises 12-15" );
    int dividend = 12, divisor = 4, quotient = 0, remainder = 0;
    int dividend2 = 13, divisor2 = 3, quotient2 = 0, remainder2 = 0;
    
    quotient = dividend/divisor; // 3
    remainder = dividend % divisor; // 0
    quotient2 = dividend / divisor2; // 4
    remainder2 = dividend2 % divisor2; //1
    
    System.out.println( quotient );
    System.out.println( remainder );
    System.out.println( quotient2 );
    System.out.println( remainder2 );
    
    // Exercise 17
    final String M = "ugg"; // constant String M
    // M = "wow"; // compile error
    
    // Math class methods
    
    /*
     * Math class methods:
     * 
     * Math.abs(x);     = Absolute value (int,double)
     * Math.pow(x,y);   = Exponent (x to the power of y)
     * Math.sqrt(x);    = Square root (double)
     * Math.ceil(x);    = Ceiling (the next highest whol num 1.1 = 2
     * Math.floor(x);   = Floor (the next lowest num 1.9 = 1)
     * Math.min(x,y);   = Minimum of x or y 
     * Math.max(x,y);   = Maximum of x or y
     * Math.random();   = Returns a random num between 0<=x<1
     * Math.round(x);   = Rounds the number
     * Math.PI          = Constant variable, returns 3.14159265...
     */
    System.out.println( "\nMath class methods" );
    System.out.println( Math.abs(-312.7) );
    System.out.println( Math.pow(5,5) );
    System.out.println( Math.sqrt(1.0) );
    System.out.println( Math.ceil(99.1));
    System.out.println( Math.floor(100.9) );
    System.out.println( Math.min(2, 25) );
    System.out.println( Math.max(2, 25) );
    System.out.println( Math.round(99.5) );
    System.out.println( Math.random() + "\t" + Math.random() );
    System.out.println( Math.PI );
    
    /*
     * Other Math methods
     * 
     * Math.log(x);       == log base e of x
     * Math.sin(x);       == sin of angle x in radians
     * Math.cos(x);       == cos of angle x in radians
     * Math.tan(x);       == tan of angle x in radians
     * Math.asin(x);      == arcisne of x in radians -PI/2 to PI/2
     * Math.acos(x);      == arccosine of x in radians -PI/2 to PI/2
     * Math.atan(x);      == arctan of x in range -PI/2 to PI/2
     * Math.toDegrees(x); == converts radians to degrees
     * Math.toRadians(x); == converts degrees to radians
     */
     
    /*
     * Project: ComputeThis
     * 
     * Print: d1 = 3PIsin(187deg) + |cos(122deg)| = -0.618672237585067
     * Print: d2 = (14.72)^3.801 + ln72 = 27496.9888867001543
     */
    
    double d10 = 3 * Math.PI * Math.sin(Math.toRadians(187)) + Math.abs( Math.cos( Math.toRadians(122) ) );
    double d20 = Math.pow(14.72, 3.801) + Math.log(72);
    System.out.println( "d1 = " + d10 );
    System.out.println( "d2 = " + d20 );
    
    
    
  } // end main method
  
} // end class