package collins.john;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by johncollins on 2/15/17.
 */
public class InputXoutputTest
{
    InputXoutput testIxO;

    @Before
    public void setUp()
    {
        testIxO = new InputXoutput();
    }

    @Test
    public void inputXoutputValidatorTest()
    {
        testIxO.setUserInput("12:39");
        testIxO.validator();
        boolean actual = testIxO.isInputValid();
        boolean expected = true;
        assertEquals("should be true, 12:39 is a regex match", expected, actual);
    }
    @Test
    public void setIs24hrFormatTest(){
        testIxO.setIs24hrFormat("M");
        boolean actual = testIxO.isIs24hrFormat();
        boolean expected = true;
        assertEquals("should be true", expected, actual);
    }
    @Test
    public void setIs24hrFormatTestFALSE(){
        testIxO.setIs24hrFormat("S");
        boolean actual = testIxO.isIs24hrFormat();
        boolean expected = false;
        assertEquals("should be false", expected, actual);
    }
}
