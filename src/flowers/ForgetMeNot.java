package flowers;

import interfaces.Colour;

public class ForgetMeNot extends Flowers {
    public static String name = "незабудки";
    public ForgetMeNot(String name) {
        super(name);
    }

    @Override
    public String showColour() {
        return " - фиолетовые";
    }
    @Override
    public void showAge() {

    }
}
