package birds;

public class Lapwing extends Birds{
    public Lapwing(String name) {
        super(name);
    }

    @Override
    public String showColour() {
        return " - светло-коричневый";
    }
}
