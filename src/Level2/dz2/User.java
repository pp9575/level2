package Level2.dz2;

import java.util.ArrayList;

public class User {
    private int number;
    private ArrayList<Integer> integersList;

    public User(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<Integer> getIntegersList() {
        return integersList;
    }

    public void setIntegersList(ArrayList<Integer> integersList) {
        this.integersList = integersList;
    }
}
