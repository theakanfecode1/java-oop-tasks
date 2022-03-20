import java.time.LocalDate;
import java.util.Date;


abstract public class Action {
    private String description;

    public Action() {
        this.description = "";
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }


    abstract boolean occursOn(int year, int month, int day);

    public String toString() {
        return description;
    }
}

