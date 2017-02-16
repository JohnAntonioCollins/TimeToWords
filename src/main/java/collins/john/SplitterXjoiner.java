package collins.john;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by johncollins on 2/15/17.
 */
public class SplitterXjoiner
{
    private boolean is24hrFormat;
    private String meridiem = "";
    private String timeNumber;
    private String hourNumber;
    private String minuteNumber;
    private String hourWord;
    private String minuteWord;
    private String timeWord;

    public SplitterXjoiner(String validInput, boolean is24hrFormat)
    {
        this.is24hrFormat = is24hrFormat;
        setTimeNumber(validInput);
        if (!is24hrFormat) merediemSetter();
        hourXminuteSplitter();
        setTimeWord();
    }

    public void merediemSetter()
    {
        Pattern p = Pattern.compile("(?i)[a|p]");
        Matcher m = p.matcher(timeNumber);

        while (m.find())
        {
            if (m.group().equals("A") || m.group().equals("a"))
            {
                this.meridiem = "AM";
            } else if (m.group().equals("p") || m.group().equals("P"))
            {
                this.meridiem = "PM";
            }
        }
    }

    public void hourXminuteSplitter()
    {
        ArrayList<String> hoursANDmins = new ArrayList<String>();
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(timeNumber);
        while (m.find())
        {
            hoursANDmins.add(m.group());
        }
        this.hourNumber = hoursANDmins.get(0);
        this.minuteNumber = hoursANDmins.get(1);
    }

    public void setTimeWord()
    {
        NumberToWord converter = new NumberToWord();
        hourWord = converter.convertNumberToWord(this.hourNumber, false);
        minuteWord = converter.convertNumberToWord(this.minuteNumber, is24hrFormat);
        timeWord = hourWord + " " + minuteWord + " " + meridiem;

    }

    public void setTimeNumber(String timeNumber)
    {
        this.timeNumber = timeNumber;
    }

    public String getMeridiem()
    {
        return meridiem;
    }

    public String getHourNumber()
    {
        return hourNumber;
    }

    public String getMinuteNumber()
    {
        return minuteNumber;
    }

    public String getTimeWord()
    {
        return timeWord;
    }
}
