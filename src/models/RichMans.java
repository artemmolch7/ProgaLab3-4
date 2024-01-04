package models;

public class RichMans extends Character {
    public RichMans(String name) {
        super(name);
    }
    private static int averageMonthlyIncome = 1000000;
    private static int moodOfRichMans = 100;
    private static int numberOfFactories = 25;

    public String didNotFindFavoriteActivity(){
        moodOfRichMans -= 50;
        return " не нашли любимое занятие";
    }
    public String lostFactories(){
        numberOfFactories -= 25;
        moodOfRichMans -= 10;
        return " потеряли фабрики";
    }
    public String lostIncome(){
        moodOfRichMans -= 40;
        averageMonthlyIncome -= 900000;
        return " потеряли доходы";
    }
}
