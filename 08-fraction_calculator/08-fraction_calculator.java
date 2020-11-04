import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    boolean quit = true;

    do {

    System.out.println("Please enter an equation in the form of operand, operator, operand. If you want to quit, just type quit.");

    String fracIn = in.nextLine();

    if (fracIn == "quit") {
      quit = false;
    }
    produceAnswer(fracIn);

    } while (quit);
  }

  public static String produceAnswer(String equation){
    int firstBlank = equation.indexOf(" ");
    int len = equation.length();

    String firOperand = equation.substring(0, firstBlank);
    String operator = equation.substring((firstBlank + 1), (firstBlank + 2));
    String secOperand = equation.substring((firstBlank + 3), len);

    System.out.println(secOperand);

    boolean conSlash = secOperand.contains("/");
    boolean conUnder = secOperand.contains("_");

    if (conSlash == true) {
      if (conUnder == true) {
        System.out.println("shmoop");
      }
      System.out.println("shmoop");
    }



    return (secOperand);
  }
}
