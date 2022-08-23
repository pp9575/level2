package Level2.dz1.task1.Animals;

public class Crocodile extends AnimalBite {
    @Override
    public void bite() {
        System.out.print("крокодил ");
        super.bite();
    }
}
