/**
 * Write a description of class PartA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CodingBat
{
/** 1) sleepIn
  *    The parameter weekday is true if it is a weekday, 
  *    and the parameter vacation is true if we are on vacation. 
  *    We sleep in if it is not a weekday or we're on vacation. 
  *    Return true if we sleep in. 
  */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        boolean result;
        result = (!weekday || vacation);
        return result; 
    }      
    
   /** 2) monkeyTrouble 
    *    We have two monkeys, a and b, and the parameters 
    *    aSmile and bSmile indicate if each is smiling. 
    *    We are in trouble if they are both smiling 
    *    or if neither of them is smiling. 
    *    Return true if we are in trouble. 
    */
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        //return result;  // fix this
        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return true;
        }
        else {
            return false;
        }
    }   
    
    /** 3) sumDouble 
     *    Given two int values, return their sum. 
     *    Unless the two values are the same, 
     *    then return double their sum.
     *    
     *    write your sumDouble method here:
     */
    public static int sumDouble(int x, int y){
        int sum;
        if (x == y){
            sum = 2*(x+y);
            return sum;
       }
        else {
            sum = x+y;
            return sum;
       }
    }
     
    /** 4) cigarParty
     *    When squirrels get together for a party, they like
     *    to have cigars. A squirrel party is successful when
     *    the number of cigars is between 40 and 60, inclusive.
     *    Unless it is the weekend, in which case there is no
     *    upper bound on the number of cigars. 
     *    Return true if the party with the given values is 
     *    successful, or false otherwise. See assignment handout 
     *    for hints.
     *    write your cigarParty method here:  
     */
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend){
            if (cigars >= 40){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (cigars >= 40 && cigars <= 60){
                return true;
            }
            else {
                return false; // fix this
            }
        }    
  }
    
  /** 5) caughtSpeeding 
   * You are driving a little too fast, and a police officer 
   * stops you. Write code to compute the result, encoded as 
   * an int value: 0=no ticket, 1=small ticket, 2=big ticket. 
   * If speed is 60 or less, the result is 0. 
   * If speed is between 61 and 80 inclusive, the result is 1. 
   * If speed is 81 or more, the result is 2. 
   * Unless it is your birthday -- on that day, your speed can
   * be 5 higher in all cases. 
   * 
   * write your caughtSpeeding method here
   */
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday){
            if (speed <= 65)   //5mph more for birthday
                return 0;
            else if (speed >= 66 && speed <= 85)
                return 1;
            else 
                return 2;
            }
        else {
            if (speed <= 60)   //5mph more for birthday
                return 0;
            else if (speed >= 61 && speed <= 80)
                return 1;
            else 
                return 2; // fix this
       }
  }
    
  /** 6) teenSum
   * Given 2 ints, a and b, return their sum. 
   * However, "teen" values in the range 13..19 inclusive,
   * are extra lucky. So if either value is a teen, 
   * just return 19.
   *    
   * write your teenSum method here
   */
  public static int teenSum(int a, int b){
      int sum;
      if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)){
          return 19;
        }
      else {
          sum = a+b;
          return sum;
        }
    }
    
  // 7) write your factorial method here
  public static int factorial(int n){
      if (n == 0){
          return 1;
        }
      else {
          int recurse = factorial (n-1);
          int result = n*recurse;
          return result;
        }
    }

  /** 8) sumDigits
   *    Given a non-negative int n, return the sum of its digits 
   *    recursively (no loops). Note that mod (%) by 10 yields 
   *    the rightmost digit (126 % 10 is 6), while divide (/) 
   *    by 10 removes the rightmost digit (126 / 10 is 12). 
   *    
   *    write your sumDigits method here
   */
  public static int sumDigits(int n) {
  if (n < 10){
      return n;
  }
  return (n%10) + sumDigits(n/10);
}
  
  /** 9) blackjack
   *    Given 2 int values greater than 0, return whichever value 
   *    is nearest to 21 without going over. Return 0 if they both 
   *    go over. 
   *    
   *    write your blackjack method here
   */    
  public static int blackjack(int a, int b){
      int n;
      if (a <= 21 && b <= 21){
          if (a > b)
            n = a;
          else
            n = b;
        }
      else if (a <= 21 || b <= 21){
          if (a < b)
            n = a;
          else
            n = b;
        }
      else {
          n = 0;
        }
      return n;
    }   
}
