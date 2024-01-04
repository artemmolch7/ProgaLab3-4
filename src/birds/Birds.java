package birds;

import interfaces.Colour;

import java.util.Objects;

public abstract class Birds implements Colour {
    private final String name;

    protected Birds(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Birds birds = (Birds) o;
        return Objects.equals(name, birds.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
