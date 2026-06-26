
/**
 * Write a description of class PartA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CodingBatTurnIn
{
   // copy and paste all your codingBat methods below
   // then turn in like a regular assignment 
   //   (include program output at bottom)

  public static void main(String[] args) {
    System.out.println("helloName(Bob) = " + helloName("Bob"));
    System.out.println("helloName(Alice) = " + helloName("Alice"));    
    System.out.println("helloName(X) = " + helloName("X")); 
    
    System.out.println("");
    
    System.out.println("makeAbba(Hi, Bye) = " + makeAbba("Hi", "Bye"));
    System.out.println("makeAbba(Yo, Alice) = " + makeAbba("Yo", "Alice"));
    System.out.println("makeAbba(What, Up) = " + makeAbba("What", "Up"));
    
    System.out.println("");
    
    System.out.println("makeTags(i, Yay) = " + makeTags("i", "Yay"));
    System.out.println("makeTags(i, Hello) = " + makeTags("i", "Hello"));
    System.out.println("makeTags(cite, Yay) = " + makeTags("cite", "Yay"));
    
    System.out.println("");
    
    System.out.println("extraEnd(Hello) = " + extraEnd("Hello"));
    System.out.println("extraEnd(ab) = " + extraEnd("ab"));
    System.out.println("extraEnd(Hi) = " + extraEnd("Hi"));
    
    System.out.println("");
    
    System.out.println("frontAgain(edited) = " + frontAgain("edited"));
    System.out.println("frontAgain(edit) = " + frontAgain("edit"));
    System.out.println("frontAgain(ed) = " + frontAgain("ed"));

    System.out.println("");

    System.out.println("doubleChar(The) = " + doubleChar("The"));
    System.out.println("doubleChar(AAbb) = " + doubleChar("AAbb"));
    System.out.println("doubleChar(Hi-There) = " + doubleChar("Hi-There"));
    
    System.out.println("");
    
    System.out.println("countHi(abc hi ho) = " + countHi("abc hi ho"));
    System.out.println("countHi(ABChi ho) = " + countHi("ABChi ho"));
    System.out.println("countHi(hihi) = " + countHi("hihi"));
    
    System.out.println("");
    
    System.out.println("xyBalance(aaxbby) = " + xyBalance("aaxbby"));
    System.out.println("xyBalance(aaxbb) = " + xyBalance("aaxbb"));
    System.out.println("xyBalance(yaaxbb) = " + xyBalance("yaaxbb"));
    
    System.out.println("");
    
    // Optional
    // System.out.println("repeatEnd(Hello, 3) = " + repeatEnd("Hello", 3));
    // System.out.println("repeatEnd(Hello, 2) = " + repeatEnd("Hello", 2));
    // System.out.println("repeatEnd(Hello, 1) = " + repeatEnd("Hello", 1));
    
    // System.out.println("");    
    
    // System.out.println("zipZap(zipXzp) = " + zipZap("zipXzp"));
    // System.out.println("zipZap(zopzop) = " + zipZap("zopzop"));
    // System.out.println("zipZap(zzzopzop) = " + zipZap("zzzpzp"));
  }

  // copy and paste your coding bat methods here
  // add the word "static" after public so your program compiles and runs
  public static String helloName(String name) {
    return "Hello " + name + "!";
  }

  public static String makeAbba(String a, String b) {
    return a + b + b + a;
  }

  public static String makeTags(String tag, String word) {
    return "<" + tag + ">" + word + "</" + tag + ">";
  }

  public static String extraEnd(String str) {
    String lastTwoChars = str.substring(str.length() - 2);
    return lastTwoChars + lastTwoChars + lastTwoChars;
  }

  public static boolean frontAgain(String str) {
    if (str.length() < 2) {
      return false;
    }

    return str.substring(0, 2).equals(str.substring(str.length() - 2));
  }

  public static String doubleChar(String str) {
    String result = "";
    for (int i = 0; i < str.length(); i++) {
      String current = str.substring(i, i + 1);
      result += current;
      result += current;
    }

    return result;
  }

  public static int countHi(String str) {
    int count = 0;
    
    for (int i = 0; i < str.length() - 1; i++) {
      if (str.substring(i, i + 2).equals("hi")) {
        count++;
      }
    }
    
    return count;
  }

  public static boolean xyBalance(String str) {
      boolean y = false;
      for (int i = str.length() - 1; i >= 0; i--) {
          if (str.charAt(i) == 'y')
              y = true;

          if (str.charAt(i) == 'x' && !y)
              return false;
      }

      return true;
  }

  public String repeatEnd(String str, int n) {
    String result = "";
    for (int i = 0; i < n; i++) {
      result += str.substring(str.length() - n);
    }
    
    return result;
  }
}   

/*
Output:

helloName(Bob) = Hello Bob!
helloName(Alice) = Hello Alice!
helloName(X) = Hello X!

makeAbba(Hi, Bye) = HiByeByeHi
makeAbba(Yo, Alice) = YoAliceAliceYo
makeAbba(What, Up) = WhatUpUpWhat

makeTags(i, Yay) = <i>Yay</i>
makeTags(i, Hello) = <i>Hello</i>
makeTags(cite, Yay) = <cite>Yay</cite>

extraEnd(Hello) = lololo
extraEnd(ab) = ababab
extraEnd(Hi) = HiHiHi

frontAgain(edited) = true
frontAgain(edit) = false
frontAgain(ed) = true

doubleChar(The) = TThhee
doubleChar(AAbb) = AAAAbbbb
doubleChar(Hi-There) = HHii--TThheerree

countHi(abc hi ho) = 1
countHi(ABChi ho) = 1
countHi(hihi) = 2

xyBalance(aaxbby) = true
xyBalance(aaxbb) = false
xyBalance(yaaxbb) = false

*/
