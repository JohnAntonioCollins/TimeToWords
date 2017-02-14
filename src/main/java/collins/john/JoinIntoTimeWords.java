package collins.john;

/**
 * Created by johncollins on 2/13/17.
 */
public class JoinIntoTimeWords
{
    String hoursInWords;
    String minutesInWords;
    String timeinWords;


    public String joinTimeWords(String hoursInWords, String minutesInWords){
        this.hoursInWords = hoursInWords;
        this.minutesInWords = minutesInWords;
        timeinWords = hoursInWords+"-"+minutesInWords;
        return timeinWords;
    }
}
