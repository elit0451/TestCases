import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProgramTest {
    Program myProgram;

    @Before
    public void setUp() {
        myProgram = new Program();
    }

    @Test
    public void testWith0Numbers() {

        // set
        String[] emptyArray = {};
        int[] resultArray = {};

        try {
            // execute
            resultArray = myProgram.main(emptyArray);
        }catch (Exception e) {
            // verify
            assertTrue(e.getClass() == IllegalArgumentException.class);
            assertTrue(resultArray.length == 0);
        }
    }

    @Test
    public void testWith1Number() {

        // set
        String[] oneElmArray = {"17"};
        int[] resultArray = {17, 17};

        // execute
        int[] actualResult = myProgram.main(oneElmArray);

        // verify
        assertArrayEquals(resultArray, actualResult);
    }

    @Test
    public void testWith2Numbers() {

        // set
        String[] oneElmArray = {"17", "19"};
        int[] resultArray = {17, 19};

        // execute
        int[] actualResult = myProgram.main(oneElmArray);

        // verify
        assertArrayEquals(resultArray, actualResult);
    }

    @Test
    public void testWithMoreNumbers() {

        // set
        String[] oneElmArray = {"17", "19", "12", "24"};
        int[] resultArray = {12, 24};

        // execute
        int[] actualResult = myProgram.main(oneElmArray);

        // verify
        assertArrayEquals(resultArray, actualResult);
    }

    @Test
    public void testWithEqualNumbers() {

        // set
        String[] oneElmArray = {"17", "12", "33", "12"};
        int[] resultArray = {12, 33};

        // execute
        int[] actualResult = myProgram.main(oneElmArray);

        // verify
        assertArrayEquals(resultArray, actualResult);
    }
}
