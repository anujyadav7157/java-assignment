public class StudentRecord {

  public void StudentRecord_main() {
    Student std1 = new Student("Aditya", "25csu016");
    std1.setMark(80);
    Student std2 = new Student("Aman", "25csu006", 49);
    Student std3 = new Student("Aarav", "25csu004", 50);
    Student std4 = new Student("Bharot", "25csu009", -100);
    Student std5 = new Student("Chirag", "25csu010", 79);

    System.out.println(std1);
    std1.display();
    System.out.println();

    System.out.println(std2);
    std2.display();
    System.out.println();

    System.out.println(std3);
    std3.display();
    System.out.println();

    System.out.println(std4);
    std4.display();
  }

  public class Student {
    private String name;
    private String studentId;
    private int mark;
    static protected float passingCriteria = 40;

    public int getMark() {
      return mark;
    }

    public String getName() {
      return name;
    }

    public String getStudentId() {
      return studentId;
    }

    public boolean setMark(int newMark) {
      if (checker(newMark)) {
        this.mark = newMark;
        return true;
      }
      return false;
    }

    Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    Student(String name, String studentId, int mark) {
      if (setMark(mark)) {
      } else {
        System.err.println("Enter marks in valid range: between 0 and 100");
      }
      this.name = name;
      this.studentId = studentId;
    }

    private boolean hasPassed() {
      return (this.mark >= passingCriteria);
    }

    private boolean checker(int mark) {
      return (mark >= 0 && mark <= 100);
    }

    public void display() {
      System.out.println("Student Name: " + name);
      System.out.println("Student ID: " + studentId);
      System.out.println("Student Marks: " + mark);
      String pass = hasPassed() ? "Pass" : "Fail";
      System.out.println("Result: " + pass);

    }
  }
}
