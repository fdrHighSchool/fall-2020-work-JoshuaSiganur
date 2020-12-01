import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    boolean quit = true;

    do { //i know there is a different type of while loop but i know how to use this one

    System.out.println("Please enter an equation in the form of operand, operator, operand. If you want to quit, just type quit.");

    String fracIn = in.nextLine();

    if (fracIn.equals("quit")) {
      break;
    }
    produceAnswer(fracIn);

    } while (quit);
  }

  public static String produceAnswer(String equation){ //i had to define some definite features, ones that stay the same
    int firstBlank = equation.indexOf(" ");
    int len = equation.length();

    String firOperand = equation.substring(0, firstBlank); //these define where the operands and operator are
    String operator = equation.substring((firstBlank + 1), (firstBlank + 2));
    String secOperand = equation.substring((firstBlank + 3), len);

    //here i have to set the parts of the fraction
    String who1 = whole(firOperand);
    String who2 = whole(secOperand);

    String num1 = numerator(firOperand);
    String num2 = numerator(secOperand);

    String den1 = denominator(firOperand);
    String den2 = denominator(secOperand);

    String nwd1 = "Whole number for the first operand: " + who1 + " " + "Numerator: " + num1 + " " + "Denominator: " + den1;
    String nwd2 = "Whole number for the second operand: " + who2 + " " + "Numerator: " + num2 + " " + "Denominator: " + den2;

    System.out.println(nwd1);
    System.out.println(nwd2);

    //this part changes the string parts into int ones so they can be operated on
    int intWho1 = Integer.parseInt(who1);
    int intWho2 = Integer.parseInt(who2);
    int intNum1 = Integer.parseInt(num1);
    int intNum2 = Integer.parseInt(num2);
    int intDen1 = Integer.parseInt(den1);
    int intDen2 = Integer.parseInt(den2);


    if (operator.equals("+")) {
      if (intDen1 == intDen2)
        addSameDen(intWho1, intWho2, intNum1, intNum2, intDen1, intDen2);

      else {
        addDifDen(intWho1, intWho2, intNum1, intNum2, intDen1, intDen2);
      }
    }

    if (operator.equals("-")) {
      if (intDen1 == intDen2)
        subSameDen(intWho1, intWho2, intNum1, intNum2, intDen1, intDen2);

      else {
        subDifDen(intWho1, intWho2, intNum1, intNum2, intDen1, intDen2);
      }
    }

    if (operator.equals("*")) {
      multiply(intWho1, intWho2, intNum1, intNum2, intDen1, intDen2);
    }

    if (operator.equals("/")) {
      divide(intWho1, intWho2, intNum1, intNum2, intDen1, intDen2);
    }

    return (nwd1);
  }


 //lines 88 - 116 came from Xin Bao so thanks to him
 public static String whole(String equation) {
    if(equation.contains("_")) {
      return equation.substring(0, equation.indexOf("_"));
    }
    if(equation.contains("/")){
      return "0";
    }
    else return equation;
  }

  public static String numerator(String equation) {
    if(equation.contains("_")){
      return equation.substring(equation.indexOf("_") + 1, equation.indexOf("/"));

    }else if(equation.contains("/")) {
      return equation.substring(0, equation.indexOf("/"));
    }else {
      return "0";
    }
  }

  public static String denominator(String equation) {
    if(equation.contains("/")) {
      return equation.substring(equation.indexOf("/") + 1);
    } else {
      return "1";
    }
  }

  //these methods (lines 118 - 193) are all for adding, subtracting, multiplying, and dividing
  public static int addSameDen(int who1, int who2, int num1, int num2,int den1, int den2) {
    int impropNum1 = (den1 * who1) + num1; //i turn the numerator into an improper one
    int impropNum2 = (den2 * who2) + num2;

    int finalNum = impropNum1 + impropNum2;

    System.out.println("The result is: " + finalNum + "/" + den1);
    simplify(finalNum, den1);
    return 0;
  }

  public static int addDifDen(int who1, int who2, int num1, int num2, int den1, int den2) {
    int impropNum1 = (den1 * who1) + num1;
    int impropNum2 = (den2 * who2) + num2;

    int newNum1 = impropNum1 * den2;
    int newNum2 = impropNum2 * den1;

    int finalNum = newNum1 + newNum2;
    int finalDen = den1 * den2;

    System.out.println("The result is: " + finalNum + "/" + finalDen);
    simplify(finalNum, finalDen);
    return 0;
  }

  public static int subSameDen(int who1, int who2, int num1, int num2, int den1, int den2) {
    int impropNum1 = (den1 * who1) + num1;
    int impropNum2 = (den2 * who2) + num2;

    int finalNum = impropNum1 - impropNum2;

    System.out.println("The result is: " + finalNum + "/" + den1);
    simplify(finalNum, den1);
    return 0;
  }

  public static int subDifDen(int who1, int who2, int num1, int num2, int den1, int den2) {
    int impropNum1 = (den1 * who1) + num1;
    int impropNum2 = (den2 * who2) + num2;

    int newNum1 = impropNum1 * den2;
    int newNum2 = impropNum2 * den1;

    int finalNum = newNum1 - newNum2;
    int finalDen = den1 * den2;

    System.out.println("The result is: " + finalNum + "/" + finalDen);
    simplify(finalNum, finalDen);
    return 0;
  }

  public static int multiply(int who1, int who2, int num1, int num2, int den1, int den2) {
    int impropNum1 = (den1 * who1) + num1;
    int impropNum2 = (den2 * who2) + num2;

    int finalNum = impropNum1 * impropNum2;
    int finalDen = den1 * den2;

    System.out.println("The result is: " + finalNum + "/" + finalDen);
    simplify(finalNum, finalDen);
    return 0;
  }

  public static int divide(int who1, int who2, int num1, int num2, int den1, int den2) {
    int impropNum1 = (den1 * who1) + num1;
    int impropNum2 = (den2 * who2) + num2;

    int finalNum = impropNum1 * den2;
    int finalDen = impropNum2 * den1;

    System.out.println("The result is: " + finalNum + "/" + finalDen);
    simplify(finalNum, finalDen);
    return 0;
  }

//this method simplifies each fraction that can be simplified and displays the new fraction
  public static int simplify(int finalNum, int finalDen) {

    int gcd = 1;

    for (int i = 1; i <= finalDen && i <= finalDen; i++) {

      if (finalNum % i == 0 && finalDen % i == 0)
        gcd = i;
    }

    System.out.println("The GCD is: " + gcd);

    int newFinalNum = finalNum / gcd;
    int newFinalDen = finalDen / gcd;

    System.out.println("The new reduced fraction is: " + newFinalNum + "/" + newFinalDen);

    return(newFinalNum & newFinalDen);
  }
}
