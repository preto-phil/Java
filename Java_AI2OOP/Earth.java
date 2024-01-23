public class Earth {
    public static void main(String args[]) {
        // Human Dude;
        // // Call human constructor to create an object
        // // Dude is an instance variable which points to the object
        // // Dude object is created in the line below
        // Dude = new Human();
        // // Assign arguments to Dude object
        // Dude.age = 26;
        // Dude.name = "Philip Pretorius";
        // Dude.eyeColor = "Brown";
        // Dude.heightCentimeter = 172;
        // // Invoke speak method on Dude object
        // Dude.speak();

        // Human Dudette = new Human();
        // Dudette.age = 24;
        // Dudette.name = "Mia";
        // Dudette.eyeColor = "Brown";
        // Dudette.heightCentimeter = 168;
        // Dudette.speak();

        Human human1 = new Human("Philip", 26, 172, "Brown");
        Human human2 = new Human("Mia", 24, 170, "Brown");
        human1.speak();
        human2.speak();
    }
}
