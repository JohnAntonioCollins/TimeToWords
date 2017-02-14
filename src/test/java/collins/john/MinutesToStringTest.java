package collins.john;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by johncollins on 2/13/17.
 */
public class MinutesToStringTest
{
    String input;
    String testTime;
    MinutesToString testMinToString;
    SplitIntoHoursAndMinutes testSplitter;

    @Before
    public void setUp()
    {
        input = "37";
        testTime = "4:35";
        testMinToString = new MinutesToString();
        testSplitter = new SplitIntoHoursAndMinutes(testTime);
    }
    @Test
    public void MinutesToStringTest10through19ANDoClock(){
        String actual = testMinToString.minutesToString("00");
        String expected = "o'clock";
        assertEquals("should be o'clock", expected, actual);
    }
    @Test
    public void MinutesToStringTestOneThroughNine(){
        String actual = testMinToString.minutesToString("49");
        String expected = "o'clock";
        assertEquals("should be o'clock", expected, actual);
    }
}