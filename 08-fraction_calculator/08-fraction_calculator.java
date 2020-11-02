import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Please enter an equation in the form of operand, operator, operand");
    String fracIn = in.nextLine();

    produceAnswer(fracIn);
  }

  public static String produceAnswer(String equation){
    int firstBlank = equation.indexOf(" ");
    int len = equation.length();

    String firOperand = equation.substring(0, firstBlank);
    String operator = equation.substring((firstBlank + 1), (firstBlank + 2));
    String secOperand = equation.substring((firstBlank + 3), len);

    System.out.println(secOperand);
    return (secOperand);
  }
}
