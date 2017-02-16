package collins.john;

import java.util.Scanner;

/**
 * Created by johncollins on 2/13/17.
 */
public class main
{
    public static void main(String[] args)
    {
        String format12x24;
        String userInput = "";
        Scanner scan = new Scanner(System.in);
        InputXoutput iO = new InputXoutput();

        while (!userInput.equals("exit"))
        {
            System.out.println(iO.getAskUserFor12hrX24hr());

            format12x24 = scan.nextLine();

            iO.setIs24hrFormat(format12x24);

            System.out.println(iO.getAskUserForTime());

            userInput = scan.nextLine();
            iO.setUserInput(userInput);
            iO.validator();
            if (iO.isInputValid())
            {
                SplitterXjoiner sXj = new SplitterXjoiner(iO.getValidInput(), iO.isIs24hrFormat());

                System.out.println("\n"+sXj.getTimeWord()+"\n");
            }
        }
    }
}





