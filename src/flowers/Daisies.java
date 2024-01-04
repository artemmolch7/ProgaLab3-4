package flowers;

import interfaces.Colour;

public class Daisies extends Flowers {
    public Daisies(String name) {
        super(name);
    }
    @Override
    public String showColour() {
        return " - белые";
    }

    @Override
    public void showAge() {
    }
}
