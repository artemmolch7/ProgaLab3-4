package birds;

public class Swallows extends Birds{
    public Swallows(String name) {
        super(name);
    }

    @Override
    public String showColour() {
        return " - черно-белые";
    }
}
