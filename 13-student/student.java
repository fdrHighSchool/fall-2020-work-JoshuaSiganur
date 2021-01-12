import java.util.Arrays;

public class Student {

  private String name;
  private String osis;
  private int[] grades;

//constructor
  public Student(String n, String o) {
    this.name = n;
    this.osis = o;
    grades = new int[10];
  }

//other stuff
  public String toString() {
    return "Student: " + this.name +  " OSIS: " + this.osis;
  }

  public void fillArray() {
    for (int i = 0; i < this.grades.length; i++) {
      this.grades[i] = (int)(Math.random() * 46 + 55);
    }
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public String getOSIS() {
    return this.osis;
  }

  public void displayGrades() {
    System.out.println(Arrays.toString(this.grades));
  }

  public void addGrade (int grade) {
    int i = 0;
    while (this.grades[i] != 0) {
      i++;
    }
    this.grades[i] = grade;
  }

  public double calculateAverage() {
    double sum = 0;
    int count = 0;

    for (int i = 0; i < this.grades.length; i++) {
      if (this.grades[i] != 0) {
        sum += this.grades[i];
        count++;
      }
    }
    return sum / count;
  }
}
