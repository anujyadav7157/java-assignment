public class TextProfile {
  public void TextProfile_main(String[] args) {
    if (args.length < 3) {

      args = new String[] {"Anuj rao sikandarpuriya", "20", "1.75"};
    }

    String nameStr = args[0];
    String ageStr = args[1];
    String heightStr = args[2];

    try {
      int age = Integer.parseInt(ageStr);
      double height = Double.parseDouble(heightStr);

      Profile p = new Profile(nameStr, age, height);
      System.out.println(p);

      // reverse conversion
      String reverseAge = String.valueOf(p.getAge());
      System.out.println("Reverse conversion of age: " + reverseAge);

    } catch (NumberFormatException e) {
      // nvalid numeric text causes NumberFormatException
      System.err.println("Error: Age and height must be valid numbers");
      System.err.println("Invalid numeric text causes NumberFormatException");
    }
  }

  public class Profile {
    private String name;
    private int age;
    private double heightMetres;

    Profile(String name, int age, double heightMetres) {
      if (name != null && !name.trim().isEmpty()) {
        this.name = name;
      } else {
        System.err.println("Name cannot be blank");
        this.name = "Unknown";
      }

      if (age >= 0) {
        this.age = age;
      } else {
        System.err.println("Age cannot be negative");
        this.age = 0;
      }

      if (heightMetres > 0) {
        this.heightMetres = heightMetres;
      } else {
        System.err.println("Height must be positive");
        this.heightMetres = 1.0;
      }
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getHeightMetres() { return heightMetres; }

    public String toString() {
      return "Profile name=" + name + ", age=" + age + ", height=" + heightMetres + "m";
    }
  }
}
