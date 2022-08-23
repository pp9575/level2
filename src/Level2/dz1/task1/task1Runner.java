package Level2.dz1.task1;

import Level2.dz1.task1.Animals.*;

public class task1Runner {
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
    public static void main(String[] args) {
        //создаем зоопарки
        Zoo <AnimalSwim, AnimalBite, AnimalFly> zoo1 = new Zoo<>();
        Zoo <AnimalSwim, AnimalBite, AnimalFly> zoo2 = new Zoo<>();

        //создаем животных
        Whale whale = new Whale();
        Dolphin dolphin = new Dolphin();
        Crocodile crocodile = new Crocodile();
        Tiger tiger = new Tiger();
        Eagle eagle = new Eagle();
        Parrot parrot = new Parrot();

        //распределяем животных по зоопаркам
        zoo1.setAnimalSwim(whale);
        zoo1.setAnimalBite(crocodile);
        zoo1.setAnimalFly(eagle);
        zoo2.setAnimalSwim(dolphin);
        zoo2.setAnimalBite(tiger);
        zoo2.setAnimalFly(parrot);

        //вызываем методы зоопарков
        zoo1.feedSwimable();
        zoo2.feedSwimable();
        zoo1.feedBitable();
        zoo2.feedBitable();
        zoo1.feedFlyable();
        zoo2.feedFlyable();


    }


}
