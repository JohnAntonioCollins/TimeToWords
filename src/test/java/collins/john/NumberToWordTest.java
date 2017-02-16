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
        testNumber = "24";

    }

    @Test
    public void numberToWordTest()
    {
        String actual = n2wTest.convertNumberToWord(testNumber);
        String expected = "twenty-four";
        assertEquals("should say 'twenty-four'", expected, actual);
    }

}
