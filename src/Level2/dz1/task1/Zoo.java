package Level2.dz1.task1;

import Level2.dz1.task1.Animals.AnimalBite;
import Level2.dz1.task1.Animals.AnimalFly;
import Level2.dz1.task1.Animals.AnimalSwim;

public class Zoo <S extends AnimalSwim, B extends AnimalBite, F extends AnimalFly> {

private S animalSwim;
private B animalBite;
private F animalFly;


    public S getAnimalSwim() {
        return animalSwim;
    }

    public void setAnimalSwim(S animalSwim) {
        this.animalSwim = animalSwim;
    }

    public B getAnimalBite() {
        return animalBite;
    }

    public void setAnimalBite(B animalBite) {
        this.animalBite = animalBite;
    }

    public F getAnimalFly() {
        return animalFly;
    }

    public void setAnimalFly(F animalFly) {
        this.animalFly = animalFly;
    }

    public void feedFlyable() {
        System.out.println("летающее животное ест");
        animalFly.fly();
    }

    public void feedSwimable() {
        System.out.println("плавающее животное ест");
        animalSwim.swim();
    }

    public void feedBitable() {
        System.out.println("кусающее животное ест");
        animalBite.bite();
    }

}
