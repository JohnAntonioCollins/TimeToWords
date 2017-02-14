package collins.john;

/**
 * Created by johncollins on 2/13/17.
 */
public class MinutesToString
{
    String minuteTensPlaceWord = "";
    String minuteOnesPlaceWord = "";
    String minutesInWords = "problem";

    public String minutesToString(String minutesInNumbers)

    {
        //for ten through nineteen, and o'clock
        if (minutesInNumbers.equals("00"))
        {
            minutesInWords = "o'clock";
            return minutesInWords;
        } else if (minutesInNumbers.equals("10"))
        {
            minutesInWords = "ten";
            return minutesInWords;

        } else if (minutesInNumbers.equals("11"))
        {
            minutesInWords = "eleven";
            return minutesInWords;

        } else if (minutesInNumbers.equals("12"))
        {
            minutesInWords = "twelve";
            return minutesInWords;

        } else if (minutesInNumbers.equals("13"))
        {
            minutesInWords = "thirteen";
            return minutesInWords;

        } else if (minutesInNumbers.equals("14"))
        {
            minutesInWords = "fourteen";
            return minutesInWords;

        } else if (minutesInNumbers.equals("15"))
        {
            minutesInWords = "fifteen";
            return minutesInWords;

        } else if (minutesInNumbers.equals("16"))
        {
            minutesInWords = "sixteen";
            return minutesInWords;

        } else if (minutesInNumbers.equals("17"))
        {
            minutesInWords = "seventeen";
            return minutesInWords;

        } else if (minutesInNumbers.equals("18"))
        {
            minutesInWords = "eighteen";
            return minutesInWords;

        } else if (minutesInNumbers.equals("19"))
        {
            minutesInWords = "nineteen";
            return minutesInWords;

        } else
        {

            String[] minutesArray = minutesInNumbers.split("(?!^)");
            //for zero through nine one's place
            if (minutesArray[1].equals("0"))
            {
                minuteOnesPlaceWord = "";
            }
            if (minutesArray[1].equals("1"))
            {
                minuteOnesPlaceWord = "one";
            }
            if (minutesArray[1].equals("2"))
            {
                minuteOnesPlaceWord = "two";
            }
            if (minutesArray[1].equals("3"))
            {
                minuteOnesPlaceWord = "three";
            }
            if (minutesArray[1].equals("4"))
            {
                minuteOnesPlaceWord = "four";
            }
            if (minutesArray[1].equals("5"))
            {
                minuteOnesPlaceWord = "five";
            }
            if (minutesArray[1].equals("6"))
            {
                minuteOnesPlaceWord = "six";
            }
            if (minutesArray[1].equals("7"))
            {
                minuteOnesPlaceWord = "seven";
            }
            if (minutesArray[1].equals("8"))
            {
                minuteOnesPlaceWord = "eight";
            }
            if (minutesArray[1].equals("9"))
            {
                minuteOnesPlaceWord = "nine";
            }

            //for tens-place
            if (minutesArray[0].equals("0"));
            {
                minuteTensPlaceWord = "oh-";
            }
            if (minutesArray[0].equals("2"))
            {
                minuteTensPlaceWord = "twenty";
            }
            if (minutesArray[0].equals("3"))
            {
                minuteTensPlaceWord = "thirty";
            }
            if (minutesArray[0].equals("4"))
            {
                minuteTensPlaceWord = "forty";
            }
            if (minutesArray[0].equals("5"))
            {
                minuteTensPlaceWord = "fifty";
            }


            minutesInWords = minuteTensPlaceWord + minuteOnesPlaceWord;
            return minutesInWords;

        }
    }
}


