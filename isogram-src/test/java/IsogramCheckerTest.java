import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsogramCheckerTest {

    @Test
    public void testEmptyString() { //done
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram(""));
    }

  
    @Test
    public void testLowercaseIsogram() { //done
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("isogram"));
    }

  
    @Test
    public void testNotIsogram() { //done
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("eleven"));
    }

  
    @Test
    public void testDuplicateEndAlphabet() { //done
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("zzyzx"));
    }

  
    @Test
    public void testMediumLongIsogram() { //done
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("subdermatoglyphic"));
    }

  
    @Test
    public void testCaseInsensitive() { //done
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("Alphabet"));
    }

  
    @Test
    public void testDuplicatMixedCase() { //done
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("alphAbet"));
    }

  
    @Test
    public void testIsogramWithHyphen() { //done
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("thumbscrew-japingly"));
    }

  
    @Test
    public void testIsogramWithDuplicatedCharAfterHyphen() { //done
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("thumbscrew-jappingly"));
    }

  
    @Test
    public void testIsogramWithDuplicatedHyphen() { //done
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("six-year-old"));
    }

  
    @Test
    public void testMadeUpNameThatIsAnIsogram() { //done
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("Emily Jung Schwartzkopf"));
    }

  
    @Test
    public void testDuplicatedCharacterInTheMiddleIsNotIsogram() { //done
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("accentor"));
    }

  
    @Test
    public void testSameFirstAndLast() { //done
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("angola"));
    }

}
