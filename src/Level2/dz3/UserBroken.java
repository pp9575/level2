package Level2.dz3;

import java.util.Objects;

public class UserBroken {

    private int age;
    private String name;

    public UserBroken(String name) {
        this.name = name;
    }

//    @Override
//    public boolean equals(Object o) {
//        return true;
//    }

    @Override
    public int hashCode() {
        return 10;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserBroken that = (UserBroken) o;
        return name.equals(that.name);
    }
}
