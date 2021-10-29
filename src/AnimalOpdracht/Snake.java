package AnimalOpdracht;

public class Snake extends Animal {


    public Snake() {
        this("I'm Snake ....");
    }

    public Snake(String name) {
        super(name);
    }

    @Override
    public void move() {

        System.out.println("Snake is Crawling");

    }

    @Override
    public void makeNoise() {
        System.out.println("Snake noise is vissssss. vissss...");

    }
}
