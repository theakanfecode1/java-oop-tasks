import java.time.LocalDate;
import java.util.Date;

public class RareAction extends Action{

    private int day;
    private int month;
    private int year;

    public RareAction() {
        day = 0;
        month = 0;
        year = 0;
    }


    @Override
    boolean occursOn(int year, int month, int day) {
        LocalDate inputDate = LocalDate.of(year,month,day);
        LocalDate eventDate = LocalDate.of(this.year,this.month,this.day);
        if(inputDate.isEqual(eventDate))
            return true;
        else
            return false;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
