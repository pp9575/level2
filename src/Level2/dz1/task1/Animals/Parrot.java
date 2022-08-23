package Level2.dz1.task1.Animals;

public class Parrot extends AnimalFly{
    @Override
    public void fly() {
        System.out.print("попугай ");
        super.fly();
    }
}
