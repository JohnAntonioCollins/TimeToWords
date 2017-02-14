package collins.john;

/**
 * Created by johncollins on 2/13/17.
 */
public class HoursToString
{




    public String hoursToString(String hoursInNumbers)

    {
        String hoursInWords = "problem";

        if (hoursInNumbers.equals("1"))
        {
            hoursInWords = "one";
        } else if (hoursInNumbers.equals("2"))
        {
            hoursInWords = "two";
        } else if (hoursInNumbers.equals("3"))
        {
            hoursInWords = "three";
        } else if (hoursInNumbers.equals("4"))
        {
            hoursInWords = "four";
        } else if (hoursInNumbers.equals("5"))
        {
            hoursInWords = "five";
        } else if (hoursInNumbers.equals("6"))
        {
            hoursInWords = "six";
        } else if (hoursInNumbers.equals("7"))
        {
            hoursInWords = "seven";
        } else if (hoursInNumbers.equals("8"))
        {
            hoursInWords = "eight";
        } else if (hoursInNumbers.equals("9"))
        {
            hoursInWords = "nine";
        } else if (hoursInNumbers.equals("10"))
        {
            hoursInWords = "ten";
        } else if (hoursInNumbers.equals("11"))
        {
            hoursInWords = "eleven";
        } else if (hoursInNumbers.equals("12"))
        {
            hoursInWords = "twelve";
        }
        return hoursInWords;

    }
}
