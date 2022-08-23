package Level2.dz1.task1.Animals;

public class Tiger extends AnimalBite {
    @Override
    public void bite() {
        System.out.print("тигр ");
        super.bite();
    }
}
