class Person {
    String name;
    int age;
    Person() {
        name = "Unknown";
        age = 0;
    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println(name + " - " + age);
    }
    void display(String message) {
        System.out.println(message + name);
    }
}

class Student extends Person {
    int[] marks;
    Student(String name, int age, int[] marks) {
        super(name, age);
        this.marks = marks;
    }
    int totalMarks() {
        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return total;
    }
    public String toString() {
        return "Student: " + name + ", Age: " + age;
    }
}
class Instructor extends Person {
    String subject;
    Instructor(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    public String toString() {
        return "Instructor: " + name + ", Subject: " + subject;
    }
}
class CampusRegistry {
    Person[] people;
    int count;
    CampusRegistry(int size) {
        people = new Person[size];
        count = 0;
    }
    void addPerson(Person p) {
        if (count < people.length) {
            people[count] = p;
            count++;
        }
    }
    void search(String name) {
        for (int i = 0; i < count; i++) {
            if (people[i].name.equals(name)) {
                System.out.println("Found: " + people[i]);
            }
        }
    }
    void displayAll() {
        for (int i = 0; i < count; i++) {
            people[i].display();
        }
    }
    void displayStudents() {
        for (int i = 0; i < count; i++) {
            if (people[i] instanceof Student) {
                Student s = (Student) people[i];
                System.out.println(s + ", Total Marks = "+s.totalMarks());
            }
        }
    }
}
public class CampusManagementApp {
    public void CampusManagementApp_main() {
        CampusRegistry registry = new CampusRegistry(5);
        registry.addPerson(new Student("Abhishek", 19, new int[]{80, 75, 90}));
        registry.addPerson(new Student("Aman", 21, new int[]{70, 80, 85}));
        registry.addPerson(new Student("Aarav", 20, new int[]{90, 95, 88}));
        registry.addPerson(new Instructor("Naveen Sir", 37, "Java"));
        registry.addPerson(new Instructor("Sumit Sir", 40, "CAD"));

        System.out.println("All People: ");
        registry.displayAll();
        System.out.println("\n Search: ");
        registry.search("Rahul");
        System.out.println("\nStudents : ");
        registry.displayStudents();
    }
}
