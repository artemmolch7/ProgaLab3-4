package flowers;

import interfaces.*;

import java.util.Objects;
import java.util.Random;

public abstract class Flowers implements Colour,Age{
    private final String name;
    protected String state = "плохое";

    public void getWater(int amountOfWater) throws haveWithered {
        if (amountOfWater>50 || amountOfWater<10){
            throw new haveWithered("Цветы завяли");
        }
        else {
            state = "хорошее";
            System.out.println("Состояние цветов: " + state);
            }
        }

    public Flowers(String name) {
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
        Flowers flowers = (Flowers) o;
        return Objects.equals(name, flowers.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
