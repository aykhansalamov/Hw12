import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class Main {


    public static void main(String[] args) throws ParseException {
        Map<DayOfWeek, String> fatherSchedule = new HashMap<>();
        fatherSchedule.put(DayOfWeek.MONDAY, "do exercise");
        Map<DayOfWeek, String> motherSchedule = new HashMap<>();
        motherSchedule.put(DayOfWeek.TUESDAY, "cook meal");
        Map<DayOfWeek, String> childSchedule = new HashMap<>();
        childSchedule.put(DayOfWeek.SUNDAY, "sleep");

        Human father = new Man("Vito", "Karleone", "24/05/1974",
                95,
                fatherSchedule);

        Human mother = new Woman("Jane", "Karleone", "24/05/1976",
                85,
                motherSchedule);

        Human child = new Human("Michael", "Karleone", "24/05/2001",
                90,
                childSchedule);


        Random random = new Random();
        int secretNumber = random.nextInt(101);
        boolean feedTime;
        if (Pet.getTrickLevel() >= secretNumber) {
            feedTime = true;
        } else {
            feedTime = false;
        }


        //Pet.eat();
        System.out.println(child);
        Family family = new Family(mother, father, new ArrayList<>());

        family.addChild(child);
        family.deleteChild(0);

        System.out.println(family);

        System.out.println("Family count is: " + family.countFamily());

    }

    public static void garbageCollectorLoop() {
        for (int i = 0; i < 10000000; i++) {
            Human h = new Human();
        }

    }
}