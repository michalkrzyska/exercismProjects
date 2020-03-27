import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

    @Test
    public void testAnEmptyString() { //done
        assertEquals("", new ReverseString().reverse(""));
    }

    
    @Test
    public void testAWord() { //done
        assertEquals("tobor", new ReverseString().reverse("robot"));
    }

    
    @Test
    public void testACapitalizedWord() { //done
        assertEquals("nemaR", new ReverseString().reverse("Ramen"));
    }

    
    @Test
    public void testASentenceWithPunctuation() { //done
        assertEquals("!yrgnuh m'I", new ReverseString().reverse("I'm hungry!"));
    }

    
    @Test
    public void testAPalindrome() { //done
        assertEquals("racecar", new ReverseString().reverse("racecar"));
    }

    
    @Test
    public void testAnEvenSizedWord() { //done
        assertEquals("reward", new ReverseString().reverse("drawer"));
    }
}
