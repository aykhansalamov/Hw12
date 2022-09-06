public class Fish extends Pet {
    public Fish() {
        super( "Melon", 1, 25);
    }

    public void respond() {
        System.out.println("Hello, owner. I am " + Species.FISH + ". I miss you!");
    }
}
