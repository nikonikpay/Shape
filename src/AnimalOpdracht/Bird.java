package AnimalOpdracht;

public class Bird extends Animal {

    public Bird() {
        this("I'm Bird ....");
    }

    public Bird(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Bird is Flying");
    }

    @Override
    public void makeNoise() {
        System.out.println("Birds go jik jik...");
    }
}
