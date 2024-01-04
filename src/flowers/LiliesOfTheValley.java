package flowers;

import interfaces.Colour;

public class LiliesOfTheValley extends Flowers{
    public LiliesOfTheValley(String name) {
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
