package AnimalOpdracht;

public class Fish extends Animal{

    public Fish() {

        this("I'm Fish ....");
    }

    public Fish(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Fish lives in sea. Swimming");
    }

    @Override
    public void makeNoise() {

        System.out.println("Fish goes fish fish fish...");
    }
}
