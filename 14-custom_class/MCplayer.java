import java.util.Scanner;

public class MCplayer {
  Scanner scan = new Scanner(System.in);
  private String name;
  private String favoriteColor;
  private String hatedMob;
  private int hearts;

  public MCplayer(String n, String fc, String hm, int h){
    this.name = n;
    this.favoriteColor = fc;
    this.hatedMob = hm;
    this.hearts = h;
  }

  public void setName(String n){
    this.name = n;
  }

  public String getName(String n){
    System.out.println("What is your user's name? ");
    n = scan.nextLine();
    return n;
  }

  public String getFavoriteColor(){
    System.out.println("Based on your favorite color, I'll give you a list of plants that are that you might like and are that color.");
    String colorChoice = this.favoriteColor;

    if (colorChoice == "red"){
      System.out.println("You may like: Poppy, Red Tulip, Rosebush, Red Mushroom or Crimson Mushroom"); }

    if (colorChoice == "orange"){
      System.out.println("You may like: Orange Tulip"); }

    if (colorChoice == "yellow"){
      System.out.println("You may like: Dandelion or Sunflower"); }

    if (colorChoice == "green"){
      System.out.println("You may like: Fern, Cactus, Bamboo or Saplings"); }

    if (colorChoice == "blue"){
      System.out.println("You may like: Blue Orchid, Cornflower or Warped Mushroom"); }

    if (colorChoice == "pink"){
      System.out.println("You may like: Allium, Peony, Pink Tulip or Lilac"); }

    if (colorChoice == "black"){
      System.out.println("You may like: Wither Rose"); }

    if (colorChoice == "white"){
      System.out.println("You may like: Azure Bluet, White Tulip, Lily of the Valley or Oxeye Daisy"); }

    if (colorChoice == "brown"){
      System.out.println("You may like: Brown Mushroom"); }

  return colorChoice;
  }

  public String getHatedMob(){
    System.out.println("\nBased on one of the four original mobs you dislike, I'll tell you a fun fact or two about them. Please resort to choosing from the original four hostile mobs like the zombie, the skeleton, the spider and the creeper.");
    String mobChoice = this.hatedMob;

    if (mobChoice == "zombie"){
      System.out.println("Zombies turn into Drowned if they stay underwater too long. If they wear a helmet then they'll be protected from the sun of the daylight."); }

    if (mobChoice == "skeleton"){
      System.out.println("Skeletons run away from wolves. They have a chance of spawning with a sword instead of a bow."); }

    if (mobChoice == "creeper"){
      System.out.println("Creepers came about when there was a coding bug on pigs, causing them to 'stand' up on their four legs. If they get struck by lightning then they turn into a Charged Creeper"); }

    if (mobChoice == "spider"){
      System.out.println("Spiders are careless climbers and will climb up anything, even if it means taking damage on the way down. You can still see a spider's eyes if you throw a potion of invisibility at it."); }

    return mobChoice;
  }

  public int getHearts(){
    System.out.println("\nI will let you know how much health you have through how many hearts you have and will also tell you how much you need to get back to 100%!");
    int heartsNow = this.hearts;

    if (heartsNow < 10){
      System.out.println("You have less than 10 hearts (20 health) so that means you need " + (10 - heartsNow) + " more heart(s) (or " + ((10 - heartsNow) * 2) + " health) to be full. You should eat something.");
    }
    else{
      System.out.println("You don't need any more health, lucky.");
    }
    return heartsNow;
  }

  public String toString(){
    return "MCplayer: " + this.name + "\nFavorite Color: " + this.favoriteColor + " \nHated Mob: " + this.hatedMob + " \nHearts: " + this.hearts;
  }
}
