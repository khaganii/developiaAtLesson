package practiseOOP;

import java.util.Objects;

public class Human {
    public int id;
    public String name;
    public String prefix;
    public int salary;

    @Override
    public String toString() {
        return "Human[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", prefix='" + prefix + '\'' +
                ", salary=" + salary +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return id == human.id && salary == human.salary && Objects.equals(name, human.name) && Objects.equals(prefix, human.prefix);
    }
}
