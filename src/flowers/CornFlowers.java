package flowers;

import interfaces.Colour;

public class CornFlowers extends Flowers {
    public CornFlowers(String name) {
        super(name);
    }
    @Override
    public String showColour() {
        return " - синие";
    }
    @Override
    public void showAge() {
        int yearsWithTheOwner = 7;
        System.out.println("Скуперфильд поставил васильки у себя дома " + yearsWithTheOwner + " лет назад" );
    }
}
