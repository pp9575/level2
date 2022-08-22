package Level2.dz1.Animals;

public class Whale extends AnimalSwim {


    @Override
    public void swim() {
        System.out.print("кит ");
        super.swim();
    }
}
