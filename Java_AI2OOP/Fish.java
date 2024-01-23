public class Fish extends Animal {
    
    public Fish(int age, String gender, int weightInKilos) {
        super(age, gender, weightInKilos);
    }

    public void swim() {
        System.out.println("Swimming...");
    }
}
