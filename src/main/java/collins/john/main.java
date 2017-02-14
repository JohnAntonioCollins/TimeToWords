package collins.john;

import java.util.Scanner;

/**
 * Created by johncollins on 2/13/17.
 */
public class main
{
    public static void main(String[] args)
    {
        String timeInNumbers = "";
        Scanner scan = new Scanner(System.in);
        while (!timeInNumbers.equals("exit"))
        {
            System.out.println("Enter a time in hh:mm format and it will be converted into words. (type 'exit' to quit the program)");
            timeInNumbers = scan.nextLine();
            SplitIntoHoursAndMinutes splitter = new SplitIntoHoursAndMinutes(timeInNumbers);
            String hoursInNumbers = splitter.getHours();
            String minutesInNmbuers = splitter.getMinutes();
            HoursToString hoursWord = new HoursToString();
            MinutesToString minutesWord = new MinutesToString();
            String hoursInWords = hoursWord.hoursToString(hoursInNumbers);
            String minutesInWords = minutesWord.minutesToString(minutesInNmbuers);
            JoinIntoTimeWords joiner = new JoinIntoTimeWords();
            String timeInWords = joiner.joinTimeWords(hoursInWords, minutesInWords);
            System.out.println(timeInWords);
        }
    }
}
