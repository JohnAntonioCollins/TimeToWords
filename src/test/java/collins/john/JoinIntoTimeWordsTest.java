package collins.john;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by johncollins on 2/13/17.
 */
public class JoinIntoTimeWordsTest
{
    JoinIntoTimeWords testJoiner;
    String hoursWords;
    String minutesWords;

    @Before
    public void setUp()
    {
        testJoiner = new JoinIntoTimeWords();
        hoursWords = "eight";
        minutesWords = "fortyfive";
    }

    @Test
    public void joinIntoTimeWordsTest()
    {
        String actual = testJoiner.joinTimeWords(hoursWords, minutesWords);
        String expected = "eight-fortyfive";
        assertEquals("should be 'eight-fortyfive'", expected, actual);

    }

}
