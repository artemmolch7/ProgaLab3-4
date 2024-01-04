import enums.DayOfTheWeek;
import flowers.*;
import models.*;

public class Schedule {
    public static void FlowerWateringScheduleOfSkuperfild(Person person) throws haveWithered {
        Bells flower1 = new Bells("колокольчики");
        Violets flower5 = new Violets("фиалочки");
        CornFlowers flower7 = new CornFlowers("васильки");
        Flowers[] flowers = new Flowers[3];
        flowers[0] = flower1;
        flowers[1] = flower5;
        flowers[2] = flower7;
        int dayNumber = (int)(Math.random() * 7);
        DayOfTheWeek today = DayOfTheWeek.values()[dayNumber];
        switch(today){
            case MONDAY, WEDNESDAY, SATURDAY -> {
                System.out.println("Сегодня " + today + ", значит " + person + person.waterTheFlowers(flowers));
              }
            case TUESDAY, THURSDAY, FRIDAY, SUNDAY -> {
                System.out.println("Сегодня " + today + ", значит " + person + " не поливает цветы");
            }
        }

    }
}

