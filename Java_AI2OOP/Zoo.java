public class Zoo {
    public static void main(String[] args) {
        Animal animal1 = new Animal(5, "M", 23);
        animal1.eat();

        Bird bird1 = new Bird(9, "F", 1);
        bird1.fly();
        bird1.sleep();
    
        Fish fish1 = new Fish(2, "M", 4);
        fish1.swim();
        fish1.eat();
    }
}
