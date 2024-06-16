public class ActionDriver {


    public static void main(String[] args) {
        System.out.println("RegularAction is just a subclass of Action: "+ (Action.class.isAssignableFrom(RegularAction.class)));
        System.out.println("RegularAction activities have no extra fields: "+ (RegularAction.class.getDeclaredFields().length == 0 ));
        RegularAction regularAction = new RegularAction();
        regularAction.setDescription("Wash your hands");
        System.out.println("Looking at regular actions: "+ regularAction.toString());
        System.out.println(regularAction.occursOn(2022,3,15));
  }


}

