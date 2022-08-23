package Level2.dz1.task1.Animals;

public abstract class AnimalBite extends Animal implements bitable {
    @Override
    public void bite() {
        System.out.println("кусает");
    }
}
