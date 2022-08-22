package Level2.dz1;

import Level2.dz1.Animals.*;

public class Zoo <S extends AnimalSwim, B extends AnimalBite, F extends AnimalFly> {
    //Задача №1
    //Создать интерфейсы flyable (метод void fly()), swimable (метод void swim), bitable (метод void bite)
    //Создать класс Zoo, который может содержать в себе 3-х вида животных
    //1. Животное плавающее
    //2. Животное летающее
    //3. Животное кусающее
    //В классе Zoo будут методы получения и замены этих животных. Получить мы должны конкретные классы,
    //а не интерфейсы.
    //Зоопарк имеет методы - void feedFlyable(),void feedSwimable(),void feedBitable(). Логика внутри метода:
    //Печать на экран "летающее животное ест", вызов у животного метода fly() и тд.
    //Создать 6 классов животных - 2 класса плавающих, 2 класса летающих, 2 класса кусающих.
    //Создать по одному экземпляру на каждый класс.
    //Создать 2 экземпляра зоопарка и распределить животных по зоопаркам.
    //Никаких проверок if instanceof быть не должно, и внутри Zoo будут лежать Generics, а не интерфейсы.

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
