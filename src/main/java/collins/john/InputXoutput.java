package collins.john;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by johncollins on 2/15/17.
 */
public class InputXoutput
{
    private String validInput;
    private String userInput;
    private boolean inputValid = false;
    private final String validatorPattern = "(?i)(\\d|[1][2]):[0-5][0-9][ ]*(p+|a+)*";


    public void validator()
    {

        Pattern p = Pattern.compile(validatorPattern);
        Matcher m = p.matcher(userInput);

        if (m.find()&&m.group().substring(0,1).equals(userInput.substring(0,1)))
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
}
