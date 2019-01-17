package tugas2.app.tugas2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {

    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> breakfast = new ArrayList<String>();
        breakfast.add("Milk");
        breakfast.add("Bread");
        breakfast.add("Egg");
        breakfast.add("Juice, Orange");

        List<String> lunch = new ArrayList<String>();
        lunch.add("Spaghetti");
        lunch.add("Pizza");
        lunch.add("Burger");
        lunch.add("Tacos");

        List<String> dinner = new ArrayList<String>();
        dinner.add("Taco Salad");
        dinner.add("Cheeseburger");
        dinner.add("Fettuccine");
        dinner.add("Roast Chicken");

        List<String> exercise = new ArrayList<String>();
        exercise.add("The Push-up");
        exercise.add("The Squat");
        exercise.add("The Lunge");
        exercise.add("Triceps Dips");

        expandableListDetail.put("BREAKFAST", breakfast);
        expandableListDetail.put("LUNCH", lunch);
        expandableListDetail.put("DINNER", dinner);
        expandableListDetail.put("EXERCISE", exercise);

        return expandableListDetail;
    }
}
