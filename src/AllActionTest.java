import java.util.Scanner;

public class AllActionTest {
    public static void main(String[] args) {
        OccasionalAction firstOccasionalAction = new OccasionalAction();
        OccasionalAction secondOccasionalAction = new OccasionalAction();
        firstOccasionalAction.setDescription("Take a PCR test");
        firstOccasionalAction.setDay(11);
        secondOccasionalAction.setDescription("Take a Covid test");
        secondOccasionalAction.setDay(12);
        RegularAction firstRegularAction = new RegularAction();
        RegularAction secondRegularAction = new RegularAction();
        firstRegularAction.setDescription("Wash your hands");
        secondRegularAction.setDescription("Sit two meters apart");
        RareAction firstRareAction = new RareAction();
        RareAction secondRareAction = new RareAction();
        firstRareAction.setDescription("Get a booster shot");
        secondRareAction.setDescription("Get a covid first shot");
        firstRareAction.setDay(20);
        firstRareAction.setMonth(11);
        firstRareAction.setYear(2022);
        secondRareAction.setDay(20);
        secondRareAction.setMonth(8);
        secondRareAction.setYear(2022);


        Action[] actions = {firstOccasionalAction,
                secondOccasionalAction,
                firstRegularAction,
                secondRegularAction,
                firstRareAction,
                secondRareAction,
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (like 2018 01 30):");
        String date = scanner.nextLine();
        String[] splittedDate = date.split(" ");
        if(splittedDate.length > 2){
            int year = Integer.parseInt(splittedDate[0]);
            int month = Integer.parseInt(splittedDate[1]);
            int day = Integer.parseInt(splittedDate[2]);

            boolean hasPrintedTitleOfAllPrints = false;
            for(int i  = 0; i < actions.length; i++){
                if(actions[i].occursOn(year,month,day)){

                    if(!hasPrintedTitleOfAllPrints)
                        System.out.println("These are your actions on "+ month + "/"+ day + "/"+year );
                    System.out.println(actions[i].toString());
                    hasPrintedTitleOfAllPrints = true;
                }
            }
        }else{
            System.out.println("Invalid input, please try again and follow the specified format");

        }


    }
}
