package AnimalOpdracht;

public class AnimalApp {



    public static void main(String[] args) {

        Animal myCat = new Cat();
        myCat.move();
        myCat.makeNoise();


        Animal myBird = new Bird();
        myBird.move();
        myBird.makeNoise();


        Animal myFish = new Fish();
        myFish.move();
        myFish.makeNoise();

        Animal mySnake = new Snake();
        mySnake.move();
        mySnake.makeNoise();

    }


}
