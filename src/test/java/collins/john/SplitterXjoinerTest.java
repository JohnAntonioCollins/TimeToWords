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
        sxjTest = new SplitterXjoiner("12:15", false);
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
    @Test
    public void SplitterXJoinerConstructorTest24HR(){
        SplitterXjoiner sxjConstructor = new SplitterXjoiner("12:12", false);
        String actual = sxjConstructor.getTimeWord();
        String expected = "twelve twelve ";
        assertEquals("should say 'twelve-twelve ' <= note the space", expected, actual);
    }
    @Test
    public void SplitterXJoinerConstructorTest24HR_OH_SIX(){
        SplitterXjoiner sxjConstructor = new SplitterXjoiner("06:12", true);
        String actual = sxjConstructor.getTimeWord();
        String expected = "oh-six twelve ";
        assertEquals("should say 'oh-six twelve ' <= note the space", expected, actual);
    }
    @Test
    public void SplitterXJoinerConstructorTest24HR_OH_SIX_HUNDRED(){
        SplitterXjoiner sxjConstructor = new SplitterXjoiner("06:00", true);
        String actual = sxjConstructor.getTimeWord();
        String expected = "oh-six hundred ";
        assertEquals("should say 'oh-six hundred ' <= note the space", expected, actual);
    }

}
