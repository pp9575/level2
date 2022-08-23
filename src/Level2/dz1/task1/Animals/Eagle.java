package Level2.dz1.task1.Animals;

public class Eagle extends AnimalFly {
    @Override
    public void fly() {
        System.out.print("орел ");
        super.fly();
    }
}
