package enums;

public enum DayOfTheWeek {
    MONDAY("Понедельник"), TUESDAY("Вторник"), WEDNESDAY("Среда"),
    THURSDAY("Четверг"), FRIDAY("Пятница"), SATURDAY("Суббота"),
    SUNDAY("Воскресенье");
    private final String translation;
    DayOfTheWeek(String translation){
        this.translation = translation;
    }


    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return translation;
    }
}
