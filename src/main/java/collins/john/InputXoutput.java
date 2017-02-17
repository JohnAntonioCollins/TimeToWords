package collins.john;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by johncollins on 2/15/17.
 */
public class InputXoutput
{
    private String askUserFor12hrX24hr = "To convert Standard 12hr time format to words, enter S.\nTo convert Military 24hr time format to words, enter M.";
    private boolean is24hrFormat = false;
    private String askAs12hr = "Enter time as h:mm AM";
    private String askAs24hr = "Enter time as HH:MM";
    private String askUserForTime;
    private String validInput;
    private String userInput;
    private boolean inputValid = false;
    private final String is12hrValidatorPattern = "(?i)(\\d|[1][2]):[0-5][0-9][ ]*(p+|a+)*";
    private final String is24hrValicatorPattern = "([0-2][0-4]|[0][0-9]|[1][0-9]):[0-5][0-9]";


    public void validator()
    {
        String pattern = (is24hrFormat) ? is24hrValicatorPattern : is12hrValidatorPattern;

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(userInput);

        if (m.find() && m.group().substring(0, 1).equals(userInput.substring(0, 1)))
        {
            this.inputValid = true;
            this.validInput = userInput;
        } else
        {
            System.out.println("That's not a valid input.");
        }
    }

    public boolean isInputValid()
    {
        return inputValid;
    }

    public void setUserInput(String userInput)
    {
        this.userInput = userInput;
    }

    public String getValidInput()
    {
        return validInput;
    }

    public boolean isIs24hrFormat()
    {
        return is24hrFormat;
    }

    public void setIs24hrFormat(String format12x24)
    {
        Pattern p = Pattern.compile("(?i)[s|m]");
        Matcher m = p.matcher(format12x24);

        if (m.find())
        {
            this.is24hrFormat = (m.group().equals("M") || m.group().equals("m")) ? true : false;
            askUserForTime = is24hrFormat ? askAs24hr : askAs12hr;
        } else
        {
            System.out.println("That's not a valid input. Enter \"M\" for 24hr or \"S\" for 12hr format.");
        }
    }

    public String getAskUserForTime()
    {
        return askUserForTime;
    }

    public String getAskUserFor12hrX24hr()
    {
        return askUserFor12hrX24hr;
    }
}
