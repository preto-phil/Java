public class Bird extends Animal {

    
    public Bird(int age, String gender, int weightInKilos) {
        super(age, gender, weightInKilos);
    }

    public void move() {
        System.out.println("Flapping wings...");
    }
    
}
