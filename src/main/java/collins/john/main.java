package collins.john;

import java.util.Scanner;

/**
 * Created by johncollins on 2/13/17.
 */
public class main
{
    public static void main(String[] args)
    {
        String userInput = "";
        Scanner scan = new Scanner(System.in);
        while (!userInput.equals("exit"))
        {
            System.out.println("Enter the time in ' hh:mm AM ' format to see it converted to words.");
            userInput = scan.nextLine();
            InputXoutput iO = new InputXoutput();
            iO.setUserInput(userInput);
            iO.validator();
            if (iO.isInputValid())
            {
                SplitterXjoiner sXj = new SplitterXjoiner();
                sXj.setTimeNumber(iO.getValidInput());
                sXj.merediemSetter();
                sXj.hourXminuteSplitter();
                sXj.setTimeWord();
                System.out.println(sXj.getTimeWord());
            }
        }
    }
}





