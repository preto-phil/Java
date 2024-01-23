public class Bird extends Animal {

    
    public Bird(int age, String gender, int weightInKilos) {
        super(age, gender, weightInKilos);
    }

    public void fly() {
        System.out.println("Flying...");
    }
}
