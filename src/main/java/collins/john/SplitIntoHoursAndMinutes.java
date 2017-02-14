package collins.john;

/**
 * Created by johncollins on 2/13/17.
 */
public class SplitIntoHoursAndMinutes
{

    String time;
    String hours;
    String minutes;

    public SplitIntoHoursAndMinutes(String time12hrFormat){
        this.time = time12hrFormat;
        String[] hoursANDmins = time.split(":");
        this.hours = hoursANDmins[0];
        this.minutes = hoursANDmins[1];

    }

    public String getHours()
    {
        return hours;
    }

    public String getMinutes()
    {
        return minutes;
    }
}
