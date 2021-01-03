import java.util.*;

class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    int grades[][] = new int[30][10];

    for(int rows = 0; rows < grades.length; rows++){
      for(int cols = 0; cols < grades[rows].length; cols++){
        grades[rows][cols] = 55 + (rand.nextInt(46));
      }
      //System.out.println();
    }
  //System.out.println(Arrays.deepToString(grades));
  displayArray(grades);
  System.out.println("The top student is " + (getV(grades) + 1));
  System.out.println("The second student is " + (getS(grades) + 1));

}
  public static void displayArray(int[][] arr) {
    for (int row = 0; row < 30; row++) {
      System.out.println("Student " + (row + 1) + " = " + Arrays.toString(arr[row]) + " Average = " + getAverage(arr[row]));
  }}

    public static int getV(int[][] arr) {
    double[] averages = new double[30];
    for (int row = 0; row < 30; row++) {
      averages[row] = getAverage(arr[row]);
    }

    double maxValue = averages[0];
    int index = 0;
    for (int i = 0; i < averages.length; i++) {
      if (averages[i] > maxValue) {
        maxValue = averages[i];
        index = i;
      }
    }
    return index;
  }

   public static int getS(int[][] arr) {
    double[] averages = new double[30];
    for (int row = 0; row < 30; row++) {
      averages[row] = getAverage(arr[row]);
    }

    double maxValue = averages[0];
    int index = 0;
    for (int i = 0; i < averages.length; i++) {
      if (averages[i] > maxValue && i != getV(arr)) {
        maxValue = averages[i];
        index = i;
      }
    }
    return index;
  }

   public static double getAverage(int[] arr) {
    int sum = 0;
    for (int grades : arr) {
      sum += grades;
    }
    return (double)sum / arr.length;
  }
}  
