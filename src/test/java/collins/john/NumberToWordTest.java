package collins.john;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by johncollins on 2/15/17.
 */
public class NumberToWordTest
{
    NumberToWord n2wTest;
    String testNumber;

    @Before
    public void setUp()
    {
        n2wTest = new NumberToWord();
        testNumber = "00";
    }

    @Test
    public void numberToWordTest()
    {
        String actual = n2wTest.convertNumberToWord("59", true);
        String expected = "fifty-nine";
        assertEquals("should say 'fifty-nine'", expected, actual);
    }

    @Test
    public void numberToWordTestOcLOCK()
    {
        String actual = n2wTest.convertNumberToWord(testNumber, false);
        String expected = "o'clock";
        assertEquals("should say 'o'clock'", expected, actual);
    }

    @Test
    public void numberToWordTestHUNDRED()
    {
        String actual = n2wTest.convertNumberToWord(testNumber, true);
        String expected = "hundred";
        assertEquals("should say 'hundred'", expected, actual);
    }

    @Test
    public void numberToWordTestOH_ONE()
    {
        String actual = n2wTest.convertNumberToWord("01", true);
        String expected = "oh-one";
        assertEquals("should say 'oh-one'", expected, actual);
    }

}
