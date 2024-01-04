package flowers;

import interfaces.Colour;

public class WaterLilies extends Flowers{
    public WaterLilies(String name) {
        super(name);
    }

    @Override
    public String showColour() {
        return " - зелёные";
    }
    @Override
    public void showAge() {
    }
}
