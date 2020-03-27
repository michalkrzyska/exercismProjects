import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;


public class HammingTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testNoDistanceBetweenEmptyStrands() { //done
        assertEquals(0, new Hamming("", "").getHammingDistance());
    }

   
    @Test
    public void testNoDistanceBetweenShortIdenticalStrands() { //done
        assertEquals(0, new Hamming("A", "A").getHammingDistance());
    }

   
    @Test
    public void testCompleteDistanceInSingleLetterDifferentStrands() { //done
        assertEquals(1, new Hamming("G", "T").getHammingDistance());
    }

   
    @Test
    public void testDistanceInLongIdenticalStrands() { //done
        assertEquals(0, new Hamming("GGACTGAAATCTG", "GGACTGAAATCTG").getHammingDistance());
    }

   
    @Test
    public void testDistanceInLongDifferentStrands() { //done
        assertEquals(9, new Hamming("GGACGGATTCTG", "AGGACGGATTCT").getHammingDistance());
    }

   
    @Test
    public void testValidatesFirstStrandNotLonger() { //done
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("leftStrand and rightStrand must be of equal length.");

        new Hamming("AATG", "AAA");
    }

   
    @Test
    public void testValidatesSecondStrandNotLonger() { //done
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("leftStrand and rightStrand must be of equal length.");

        new Hamming("ATA", "AGTG");
    }

   
    @Test
    public void testDisallowLeftEmptyStrand() { //done
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("left strand must not be empty.");

        new Hamming("", "G");
    }

   
    @Test
    public void testDisallowRightEmptyStrand() { //done
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("right strand must not be empty.");

        new Hamming("G", "");
    }

}
