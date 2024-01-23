// Classes contain instructions for how objects can be created and how objects carry out behaviour

public class Human {
    String name;
    int age;
    int heightCentimeter;
    String eyeColor;

    // Constructors 
    // have same name as class - does not have to be defined

    public Human(String name, int age, int heightCentimeter, String eyeColor) {
        super();
        // this is a variable in java that points to / references the current object
        // Use this to represent an object instance
        this.age = age;
        this.name = name;
        this.eyeColor = eyeColor;
        this.heightCentimeter = heightCentimeter;
    }

    // Methods that are specifications for behaviour

    public void speak() {
      System.out.println("Hello, my name is " + name); 
      System.out.println("I am " + heightCentimeter + "cm tall");  
      System.out.println("I am " + age + " years old");  
      System.out.println("I have " + eyeColor + " eyes");  
    }

    public void eat() {
        System.out.println("Eating...");
    }

    public void walk() {
        System.out.println("Walking...");
    }

    public void work() {
        System.out.println("Working...");
    }
}