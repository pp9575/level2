package Level2.dz3;

import java.util.HashMap;
import java.util.HashSet;

public class Task {
    //Задача №1
    //1. Создать класс User, с двумя атрибутами - int age, String name
    //2. Создать экземпляр класса HashSet<User>
    //3. Переопределить hashcode и equals у User так, чтобы при записи в HashSet, были только уникальные name юзера

    public static void main(String[] args) {
        HashSet<User> userHashSet = new HashSet<>();
        userHashSet.add(new User("Yurii"));
        userHashSet.add(new User("Petr"));
        userHashSet.add(new User("Yurii"));
        System.out.println(userHashSet);


        //Задача №2
        //1. Создать класс UserBroken, с двумя атрибутами - int age, String name
        //2. Создать экземпляр класса HashSet<UserBroken>
        //3. Переопределить hashcode и equals так, чтобы при вставке любого юзера в HashSet,
        // в hashSet всегда оставался один юзер
        HashSet<UserBroken> userHashSet2 = new HashSet<>();
        userHashSet2.add(new UserBroken("Yurii"));
        userHashSet2.add(new UserBroken("Petr"));
        userHashSet2.add(new UserBroken("Yurii2"));
        userHashSet2.add(new UserBroken("Petr2"));

        System.out.println(userHashSet2);


        //Задача №3
        //1. Создать класс CarBroken
        //2. Создать экземпляра класса HashMap<CarBroken, Integer>
        //3. Переопределить hashcode и equals так, чтобы при вставке любого CarBroken в HashMap,
        //всегда CarBroken попадал в один бакет.
        HashMap<CarBroken, Integer> hashMap = new HashMap<>();
        hashMap.put(new CarBroken(), 4);
        hashMap.put(new CarBroken(), 5);
        hashMap.put(new CarBroken(), 8);
        System.out.println(hashMap);



    }
}
