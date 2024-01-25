public class Zoo {
    public static void main(String[] args) {
        Sparrow bird1 = new Sparrow(9, "F", 1);
        bird1.fly();
        bird1.sleep();
        bird1.move();
    
        Fish fish1 = new Fish(2, "M", 4);
        fish1.swim();
        fish1.eat();
        fish1.move();

        moveAnimal(fish1);
        moveAnimal(bird1);

        Flyable flyingBird = new Sparrow(5, "M", 5);
        flyingBird.fly();
    }

    public static void moveAnimal(Animal animal) {
        animal.move();
    }
}

// Methods are called on the type specification
// Objects exist when apllications run

// Polymorphism = makes program more dynamic