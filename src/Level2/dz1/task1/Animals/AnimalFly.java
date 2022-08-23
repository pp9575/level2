package Level2.dz1.task1.Animals;

public abstract class AnimalFly extends Animal implements flyable {
    @Override
    public void fly() {
            System.out.println("летит");
        }
}


