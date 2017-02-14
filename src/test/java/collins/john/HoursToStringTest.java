package collins.john;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
;

/**
 * Created by johncollins on 2/13/17.
 */
public class HoursToStringTest
{
    String input;
    String fourThirtyFive;
    HoursToString testHoursToString;
    SplitIntoHoursAndMinutes testSplitter;

    @Before
    public void setUp(){
        input  = "4";
        fourThirtyFive = "4:35";
        testHoursToString = new HoursToString();
        testSplitter = new SplitIntoHoursAndMinutes(fourThirtyFive);
    }
    @Test
    public void HoursToStringTest(){
       String actual = testHoursToString.hoursToString(input);
       String expected = "four";
       assertEquals("should return 'four'", expected, actual);
    }
    @Test
    public void SplitIntoHoursAndMinutesTest(){
        String actual = testSplitter.getHours();
        String expected = "4";
        assertEquals("should be 4", expected, actual);
    }
    @Test
    public void SplitIntoHoursAndMinutesTestMINUTES(){
        String actual = testSplitter.getMinutes();
        String expected = "35";
        assertEquals("should be 35", expected, actual);
    }


}
