package models;
import flowers.Flowers;
import flowers.haveWithered;
import interfaces.Age;
import interfaces.Colour;

import java.util.Random;

public class Person extends Character implements Age, Colour {
    private final int age;
    private final String colorOfTheSkin;
    private int mood = 0;   // настроение - значение от 0 - плохое, 100 - отличное
    public Person(String name, int age, String colorOfTheSkin) {
        super(name);
        if (age <= 0 || age >150){
            throw new AgeError("Возраст не может быть отрицательным");
        }
        this.age = age;
        this.colorOfTheSkin = colorOfTheSkin;
    }
    public void showName() {
        System.out.println("Меня зовут " + super.name);
    }
    @Override
    public void showAge() {
        System.out.println("Мне " + this.age + " лет");
    }
    @Override
    public String showColour() {
        return "Мой цвет кожи: " + this.colorOfTheSkin;
    }

    public String waterTheFlowers(Flowers[] flowers) throws haveWithered {
        mood += 5;
        Random random = new Random();
        int amountOfWater = random.nextInt(100);
        for (Flowers flower : flowers) {
            flower.getWater(amountOfWater);
        }
        return " поливает цветы";
    }

    public String toBreatheFreshAir(){
        mood += 20;
        return " дышит свежим воздухом";
    }
    public String listerToTheBirdsSinging(){
        mood += 30;
        return " слушает пение птичек";
    }
    public String lookAtTheFlowers(){
        mood += 10;
        return " глядит на цветочки";
    }
    public String haveFlowersAtHome(Flowers[] flowers){
        return " имеет дома цветы";
    }
    public String ToTakeCare(){
        mood += 15;
        return " ухаживает за цветами";
    }
    public String goOutIntoNature(){
        mood += 20;
        return " выезжает на природу";
    }
    public void showMood(){
        System.out.println("Настроение на данный момент: "+mood);
    }
}
