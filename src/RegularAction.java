import java.time.LocalDate;


public class RegularAction extends Action
{

    @Override
    boolean occursOn(int year, int month, int day) {
        return true;

    }
}

