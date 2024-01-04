import birds.Bullfinches;
import birds.Lapwing;
import birds.Swallows;
import flowers.*;
import models.Person;
import models.RichMans;

public class Main{
    public static void main(String[] args) throws haveWithered {
        Bells flower1 = new Bells("колокольчики");
        Daisies flower2 = new Daisies("ромашки");
        ForgetMeNot flower3 = new ForgetMeNot("незабудки");
        LiliesOfTheValley flower4 = new LiliesOfTheValley("ландыши");
        Violets flower5 = new Violets("фиалочки");
        WaterLilies flower6 = new WaterLilies("кувшинки");
        CornFlowers flower7 = new CornFlowers("васильки");
        Flowers[] flowers = new Flowers[3];
        flowers[0] = flower1;
        flowers[1] = flower5;
        flowers[2] = flower7;
        Bullfinches bird1 = new Bullfinches("Снегири");
        Lapwing bird2  = new Lapwing("Чибисы");
        Swallows bird3 = new Swallows("Ласточки");
        Person Skuperfild = new Person("Скуперфильд",25,"смуглый");
        RichMans richPeople = new RichMans("Многие богачи");

        Person WatchMan = new Person("Сторож",43,"бледный"){
            @Override
            public String ToTakeCare(){
                return " ухаживает за зверушками в зоопарке";
            }
        };
        Skuperfild.showName();
        Skuperfild.showAge();
        System.out.println(Skuperfild.showColour());
        System.out.println(Skuperfild + Skuperfild.haveFlowersAtHome(flowers) + ": " +flower1+flower1.showColour()+ ", "  + flower5+
                flower5.showColour()+", " + flower7+flower7.showColour());
        flower1.showAge();
        flower5.showAge();
        flower7.showAge();
        System.out.println(Skuperfild + Skuperfild.ToTakeCare());
        Skuperfild.showMood();
        Schedule.FlowerWateringScheduleOfSkuperfild(Skuperfild);
        System.out.println(Skuperfild + Skuperfild.goOutIntoNature());
        System.out.println(Skuperfild + Skuperfild.listerToTheBirdsSinging() + " таких как: " + bird1 + ", " + bird2 + ", "+ bird3);
        Skuperfild.showMood();
        System.out.println(Skuperfild + Skuperfild.lookAtTheFlowers() + ": " + flower2+flower2.showColour()+ ", " + flower3+
                flower3.showColour()+", " + flower4+flower4.showColour()+ ", " + flower6+flower6.showColour());
        System.out.println(Skuperfild + Skuperfild.toBreatheFreshAir());
        Skuperfild.showMood();
        System.out.println(richPeople + richPeople.didNotFindFavoriteActivity() + " в отличии от Скуперфильда");
        System.out.println(richPeople + richPeople.lostFactories());
        System.out.println(richPeople + richPeople.lostIncome());
        System.out.println(WatchMan + WatchMan.ToTakeCare());
    }
}

