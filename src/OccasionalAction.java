import java.time.LocalDate;

public class OccasionalAction extends Action
{

    private int day;

    public OccasionalAction() {
        this.day = 0;
    }


    @Override
    boolean occursOn(int year, int month, int day) {
        if(this.day == day)
            return true;
        else
            return false;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
