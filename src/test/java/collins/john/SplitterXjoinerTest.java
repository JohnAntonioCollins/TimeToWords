package collins.john;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by johncollins on 2/15/17.
 */
public class SplitterXjoinerTest
{
    SplitterXjoiner sxjTest;

    @Before
    public void setUp()
    {
        sxjTest = new SplitterXjoiner();
        sxjTest.setTimeNumber("12:15 pm");
    }

    @Test
    public void meridiemTest()
    {
        sxjTest.merediemSetter();
        String actual = sxjTest.getMeridiem();
        String expected = "PM";
        assertEquals("Should set to 'PM'", expected, actual);
    }

    @Test
    public void hourXminuteSplitterTest()
    {
        sxjTest.hourXminuteSplitter();
        String actual = sxjTest.getMinuteNumber();
        String expected = "15";
        assertEquals("should be '15' without 'PM'", expected, actual);
    }

    @Test
    public void setTimeWordTest()
    {
        sxjTest.merediemSetter();
        sxjTest.hourXminuteSplitter();
        sxjTest.setTimeWord();
        String actual = sxjTest.getTimeWord();

                String expected = "twelve fifteen PM";
        assertEquals("should say 'twelve fifteen PM'", expected, actual);
    }
}
