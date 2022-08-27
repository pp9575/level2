package Level2.dz1.task2;

import java.util.Arrays;

public class MyList <T> {
    //Задача №2
    //Создать класс MyList с атрибутами T[] objects, int size. T - generics.
    //Массив T[] будет созадаваться при созднии экземпляра класса MyList с размерностью 3.
    //Создать метод add. Он будет добавлять элемент в массив object. Если в массиве уже 3 элемента есть, то нужно:
    //1.Создать новый массив T[] с размерностью в два раза больше предыдущей.
    //2.Скопировать со старого массива все значения в новый
    //3.Присвоить экземпляру MyList новый массив.


    T[] objects;
    int size;

    public MyList() {
        T[] objects = (T[]) new Object[3];
    }

    public void add(T element) {
        if (size == objects.length) {
            // objects = Arrays.copyOf(objects, size * 2); так Юра ругает ))
            T[] newObjects = (T[]) new Object[size * 2];
            for (int i = 0; i < objects.length; i++) {
                newObjects[i] = objects[i];
            }
            objects = newObjects;
        }
        objects[size] = element;
        size++;
    }
}


