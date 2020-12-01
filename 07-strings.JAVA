import java.util.Scanner;
import java.util.Random;



class Main {
  public static void main(String[] args) {
    System.out.println("Your email is: ");
    email("joshua", "siganur", "220248231");
    System.out.println("\n");
    System.out.println("Your current password is: ");
    password();
  }

  public static String email(String firstName, String lastName, String studentID) {
    System.out.print(firstName.substring(0,1));
    System.out.print(lastName.substring(0));
    System.out.print(studentID.substring(5,9));
    System.out.print("@fdrhs.org");
    return ("placeholder");
  }

  public static String password() {
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    Random x = new Random();
    for (int i = 0; i < 10; i++) {
      System.out.print(alphabet.charAt(x.nextInt(alphabet.length())));
    }
    return ("placeholder");
  }
}
