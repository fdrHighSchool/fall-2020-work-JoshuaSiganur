import java.util.*;

public class Main{
  public static void main(String[] args) {
  // create Scanner object
  Scanner scanner = new Scanner(System.in);

  // ask the user for how many grades they want to enter
  System.out.print("How many grades do you want to enter? ");
  int numGrades = scanner.nextInt();

  // setup an Array to be used and filled with the user's input
  int arr[] = new int[numGrades];

  /*
  --------------------
  |    |    |    |    |
  ---------------------
  */
  // looping structure to get multiple values from the user
  for (int i = 0; i < numGrades; i++){
    // get next int and store to a variable
    // insert into the next slot in the Array
    System.out.print("Enter in the grade: ");
    arr[i] = scanner.nextInt();

  }
  // display the contents of the Array, to check that everything worked
  System.out.println(Arrays.toString(arr));

  // get the average of the grades
  System.out.println(getAverage(arr));
  System.out.println(getMedian(arr));
  System.out.println(getMode(arr));
  }//end main method

  public static double getAverage(int[] arr){
    double sum = 0;
    for(int i = 0; i < arr.length; i++){
      sum += arr[i];
    }
    return sum / arr.length;
  }

  public static double getMedian(int[] arr) {
    int i = 0;
    int j = 0;
    for (i = 0; i < arr.length; i++) {
      for (j = i + 1; j < arr.length; j++) {
        int var1 = 0;
        if (arr[i] > arr[j]) {
          var1 = arr[i];
          arr[i] = arr[j];

          arr[j] = var1;
        }
      }
    }
    System.out.println(Arrays.toString(arr));

    int index1 = arr.length / 2;
    int index2 = index1 - 1;
    double median = 0.0;
    double num1 = arr[index1];
    double num2 = arr[index2];

    if (arr.length % 2 == 0) {
      median = (num1 + num2) / 2;
    }
    else {
      median = num1;
    }

    return median;
  }

  public static int getMode(int[] arr) {
    int finalValue = 0;
    int finalCount = 0;
    int n = arr.length;
    int i = 0;
    int j = 0;

    for (i = 0; i < n; ++i) {
      int count = 0;
      for (j = 0; j < n; ++j) {
        if (arr[j] == arr[i]) {
          count++;
        }
      }

      if (count > finalCount) {
        finalCount = count;
        finalValue = arr[i];
      }
    }
    System.out.println(Arrays.toString(arr));
    return finalValue;
  }
}
