public class CourseEnrollment {
  public void CourseEnrollment_main() {
    Course c1 = new Course("CS1", "Intro to Java", 2);

    System.out.println("Initial: " + c1);
    System.out.println("Available seats: " + c1.getAvailableSeats());

    System.out.println("\nEnrolling 1: " + c1.enroll());
    System.out.println("Enrolling 2: " + c1.enroll());
    System.out.println("Is full? " + c1.isFull());
    System.out.println("Enrolling 3: " + c1.enroll());

    System.out.println("\nWithdrawing 1: " + c1.withdraw());
    System.out.println("Withdrawing 2: " + c1.withdraw());
    System.out.println("Withdrawing 3: " + c1.withdraw());
  }

  public class Course {
    private String code;
    private String title;
    private int capacity;
    private int enrolledCount;

    Course(String code, String title, int capacity) {
      this.code = code;
      this.title = title;
      if (capacity > 0) {
        this.capacity = capacity;
      } else {
        System.err.println("Capacity must be positive. Defaulting to 30.");
        this.capacity = 30;
      }
      this.enrolledCount = 0;
    }

    public boolean enroll() {
      if (isFull()) return false;
      enrolledCount++;
      return true;
    }

    public boolean withdraw() {
      if (enrolledCount == 0) return false;
      enrolledCount--;
      return true;
    }

    public boolean isFull() {
      return enrolledCount >= capacity;
    }

    public int getAvailableSeats() {
      return capacity - enrolledCount;
    }

    public String toString() {
      return ("Course: code=" + code + ", title=" + title + ", capacity=" + capacity + ", enrolled=" + enrolledCount);
    }
  }
}
