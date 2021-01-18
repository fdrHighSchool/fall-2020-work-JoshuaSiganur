import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //System.out.println("Hello world!");
    MCplayer Joshua = new MCplayer("Joshua", "black", "spider", 9);

    System.out.println(Joshua);

    Joshua.getFavoriteColor();
    Joshua.getHatedMob();
    Joshua.getHearts();
  }
}
