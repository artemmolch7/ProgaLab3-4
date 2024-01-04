package flowers;

import interfaces.Colour;

public class Bells extends Flowers {
    public Bells(String name){
        super(name);
    }

    @Override
    public String showColour() {
        return " - белые";
    }
    @Override
    public void showAge() {
        int yearsWithTheOwner = 3;
        System.out.println("Скуперфильд поставил колокольчики у себя дома " + yearsWithTheOwner + " года назад" );
    }
}
