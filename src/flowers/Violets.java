package flowers;

import interfaces.Colour;

public class Violets extends Flowers {
    public Violets(String name) {
        super(name);
    }

    @Override
    public String showColour() {
        return " - розовые";
    }
    @Override
    public void showAge() {
        int yearsWithTheOwner = 2;
        System.out.println("Скуперфильд поставил фиалочки у себя дома " + yearsWithTheOwner + " года назад" );
    }
}
