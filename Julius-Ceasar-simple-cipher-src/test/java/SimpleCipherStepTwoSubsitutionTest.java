import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

import org.junit.Before;

public class SimpleCipherStepTwoSubsitutionTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private Cipher cipherWithDefaultKey;
    private static final String key = "abcdefghij";

    @Before
    public void setup() {
        cipherWithDefaultKey = new Cipher(key);
    }

   
    @Test
    public void cipherCanEncode() {
        String plainText = "aaaaaaaaaa";
        String cipherText = "abcdefghij";
        assertEquals(cipherText, cipherWithDefaultKey.encode(plainText));
    }

   
    @Test
    public void cipherCanDecode() {
        String plainText = "abcdefghij";
        String cipherText = "aaaaaaaaaa";
        assertEquals(cipherText, cipherWithDefaultKey.decode(plainText));
    }

   
    @Test
    public void cipherIsReversibleGivenKey() {
        String plainText = "abcdefghij";
        assertEquals(plainText, cipherWithDefaultKey.decode(cipherWithDefaultKey.encode(plainText)));
    }

   
    @Test
    public void cipherCanDoubleShiftEncode() {
        String plainText = "iamapandabear";
        String cipherText = "qayaeaagaciai";
        assertEquals(cipherText, new Cipher(plainText).encode(plainText));
    }

   
    @Test
    public void cipherCanWrapEncode() {
        String plainText = "zzzzzzzzzz";
        String cipherText = "zabcdefghi";
        assertEquals(cipherText, cipherWithDefaultKey.encode(plainText));
    }

   
    @Test
    public void cipherCanWrapDecode() {
        String plainText = "zabcdefghi";
        String cipherText = "zzzzzzzzzz";
        assertEquals(cipherText, cipherWithDefaultKey.decode(plainText));
    }

   
    @Test
    public void cipherMessageLongerThanKey() {
        String plainText = "iamapandabear";
        String key = "abc";
        String cipherText = "iboaqcnecbfcr";
        assertEquals(cipherText, new Cipher(key).encode(plainText));
    }

}
