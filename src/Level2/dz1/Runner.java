package Level2.dz1;

import Level2.dz1.Animals.*;

public class Runner {
    public static void main(String[] args) {
        Zoo <AnimalSwim, AnimalBite, AnimalFly> zoo1 = new Zoo<>();
        Zoo <AnimalSwim, AnimalBite, AnimalFly> zoo2 = new Zoo<>();
        Whale whale = new Whale();
        zoo1.setAnimalSwim(whale);
        zoo1.feedSwimable();
        Dolphin dolphin = new Dolphin();
        zoo2.setAnimalSwim(dolphin);
        zoo2.feedSwimable();
    }


}
