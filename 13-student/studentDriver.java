public class Main { //should be named StudentDriver.java
  public static void main(String[] args) {
    Student student1 = new Student("Hans", "123456789");
    Student student2 = new Student("Sophia", "234567898");
    System.out.println(student1);
    System.out.println(student2);

    student1.setName("Joshua");
    System.out.println(student1);

    System.out.println(student1.getName());

    student1.addGrade(100);
    student1.displayGrades();
    student1.addGrade(90);
    student1.displayGrades();

    student2.addGrade(95);
    student2.displayGrades();

    Student student3 = new Student("Elias", "987654321");
    student3.fillArray();
    student3.displayGrades();

    System.out.println(student1.calculateAverage());
  }
}
