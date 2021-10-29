package AnimalOpdracht;

public class Cat extends Animal {

    public Cat() {

        this("I'm Cat ....");
    }

    public Cat(String name){
        super(name);

    }

    @Override
    public void move() {
        System.out.println("Cat is Moving ...");

    }

    @Override
    public void makeNoise() {
        System.out.println("Cat go mio mio");
    }
}
