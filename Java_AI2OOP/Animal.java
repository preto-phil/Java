public class Animal {
    int age;
    String gender;
    int weightInKilos;

    public Animal(int age, String gender, int weightInKilos) {
        this.age = age;
        this.gender = gender;
        this.weightInKilos = weightInKilos;
    }

    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }
}
