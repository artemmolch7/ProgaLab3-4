package models;

import java.util.Objects;

public abstract class Character {
    protected String name;
    public Character(String name){
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
        Character character = (Character) o;
        return Objects.equals(name, character.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
