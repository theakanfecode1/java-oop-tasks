import java.util.Scanner;

public class ActionDriver2 {


    public static void main(String[] args) {


        System.out.println("OccasionalAction is just a subclass of Action: "+ (Action.class.isAssignableFrom(OccasionalAction.class)));
        System.out.println("RareAction is just a subclass of Action: "+ (Action.class.isAssignableFrom(RareAction.class)));
        System.out.println("OccasionalAction activities have no extra fields: "+ (OccasionalAction.class.getDeclaredFields().length == 1 ));
        System.out.println("RareAction activities have no extra fields: "+ (RareAction.class.getDeclaredFields().length == 3 ));



        OccasionalAction occasionalAction = new OccasionalAction();
        occasionalAction.setDay(20);
        occasionalAction.setDescription("Take a PCR test");
        RareAction rareAction = new RareAction();
        rareAction.setDay(20);
        rareAction.setMonth(11);
        rareAction.setYear(2022);
        rareAction.setDescription("Get a booster shot");
        System.out.println(rareAction.occursOn(2022,11,20));
        System.out.println(occasionalAction.occursOn(2022,11,20));



    }


}

