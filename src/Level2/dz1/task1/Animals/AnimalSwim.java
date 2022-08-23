package Level2.dz1.task1.Animals;

public abstract class AnimalSwim extends Animal implements swimable {
    @Override
    public void swim() {
        System.out.println("плывет");
    }
}
