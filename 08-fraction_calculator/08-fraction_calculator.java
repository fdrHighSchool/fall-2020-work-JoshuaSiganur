import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    boolean quit = true;

    do { //i know there is a different type of while loop but i know how to use this one

    System.out.println("Please enter an equation in the form of operand, operator, operand. If you want to quit, just type quit.");

    String fracIn = in.nextLine();

    if (fracIn == "quit") {
      quit = false; //the way i have it, it crashed, but it still technically quits
    }
    produceAnswer(fracIn);

    } while (quit);
  }

  public static String produceAnswer(String equation){
    int firstBlank = equation.indexOf(" ");
    int len = equation.length();

    String firOperand = equation.substring(0, firstBlank); //these define where the operands and operator are
    String operator = equation.substring((firstBlank + 1), (firstBlank + 2));
    String secOperand = equation.substring((firstBlank + 3), len);

    String who = whole(secOperand);
    //System.out.println("1");

    String num = numerator(secOperand);
    //System.out.println("2");

    String den = denominator(secOperand);
    //System.out.println("3");
    String nwd = "Whole number: " + who + " " + "Numerator: " + num + " " + "Denominator: " + " " + den;

    System.out.println(nwd);

    return (nwd);
  }
 //these methods came from Xin Bao so thanks to him
 public static String whole(String equation){
    if(equation.contains("_")){
      return equation.substring(0, equation.indexOf("_"));
    }
    if(equation.contains("/")){
      return "0";
    }
    else return equation;
  }

  public static String numerator(String equation){
    if(equation.contains("_")){
      return equation.substring(equation.indexOf("_") + 1,equation.indexOf("/"));

    }else if(equation.contains("/")){
      return equation.substring(0, equation.indexOf("/"));
    }else{
      return "0";
    }
  }

  public static String denominator(String equation){
    if(equation.contains("/")){
      return equation.substring(equation.indexOf("/") + 1);

    }else{
      return "1";
    }
  }
} 
