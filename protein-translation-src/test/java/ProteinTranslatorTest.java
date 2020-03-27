import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProteinTranslatorTest {

    private ProteinTranslator proteinTranslator;

    @Before
    public void setUp() {
        proteinTranslator = new ProteinTranslator();
    }

    @Test
    public void testMethionineRnaSequence() { //done
        List<String> expected = Arrays.asList("Methionine");
        assertEquals(expected, proteinTranslator.translate("AUG"));
    }

 
    @Test
    public void testPhenylalanineRnaSequence1() { //done
        List<String> expected = Arrays.asList("Phenylalanine");
        assertEquals(expected, proteinTranslator.translate("UUU"));
    }

 
    @Test
    public void testPhenylalanineRnaSequence2() { //done
        List<String> expected = Arrays.asList("Phenylalanine");
        assertEquals(expected, proteinTranslator.translate("UUC"));
    }

 
    @Test
    public void testLeucineRnaSequence1() { //done
        List<String> expected = Arrays.asList("Leucine");
        assertEquals(expected, proteinTranslator.translate("UUA"));
    }

 
    @Test
    public void testLeucineRnaSequence2() { //done
        List<String> expected = Arrays.asList("Leucine");
        assertEquals(expected, proteinTranslator.translate("UUG"));
    }

 
    @Test
    public void testSerineRnaSequence1() { //done
        List<String> expected = Arrays.asList("Serine");
        assertEquals(expected, proteinTranslator.translate("UCU"));
    }

 
    @Test
    public void testSerineRnaSequence2() { //done
        List<String> expected = Arrays.asList("Serine");
        assertEquals(expected, proteinTranslator.translate("UCC"));
    }

 
    @Test
    public void testSerineRnaSequence3() {
        List<String> expected = Arrays.asList("Serine");
        assertEquals(expected, proteinTranslator.translate("UCA"));
    }

 
    @Test
    public void testSerineRnaSequence4() { //done
        List<String> expected = Arrays.asList("Serine");
        assertEquals(expected, proteinTranslator.translate("UCG"));
    }

 
    @Test
    public void testTyrosineRnaSequence1() { //done
        List<String> expected = Arrays.asList("Tyrosine");
        assertEquals(expected, proteinTranslator.translate("UAU"));
    }

 
    @Test
    public void testTyrosineRnaSequence2() { //done
        List<String> expected = Arrays.asList("Tyrosine");
        assertEquals(expected, proteinTranslator.translate("UAC"));
    }

 
    @Test
    public void testCysteineRnaSequence1() { //done
        List<String> expected = Arrays.asList("Cysteine");
        assertEquals(expected, proteinTranslator.translate("UGU"));
    }

 
    @Test
    public void testCysteineRnaSequence2() { //done
        List<String> expected = Arrays.asList("Cysteine");
        assertEquals(expected, proteinTranslator.translate("UGC"));
    }

 
    @Test
    public void testTryptophanRnaSequence1() { //done
        List<String> expected = Arrays.asList("Tryptophan");
        assertEquals(expected, proteinTranslator.translate("UGG"));
    }

 
    @Test
    public void testStopRnaSequence1() { //done
        List<String> expected = Arrays.asList();
        assertEquals(expected, proteinTranslator.translate("UAA"));
    }

 
    @Test
    public void testStopRnaSequence2() { //done
        List<String> expected = Arrays.asList();
        assertEquals(expected, proteinTranslator.translate("UAG"));
    }

 
    @Test
    public void testStopRnaSequence3() { //done
        List<String> expected = Arrays.asList();
        assertEquals(expected, proteinTranslator.translate("UGA"));
    }

 
    @Test
    public void testTranslationOfRnaToProteinList() { //done
        List<String> expected = Arrays.asList("Methionine", "Phenylalanine", "Tryptophan");
        assertEquals(expected, proteinTranslator.translate("AUGUUUUGG"));
    }

 
    @Test
    public void testTranslationStopsIfStopCodonAtBeginning() { //done
        List<String> expected = Arrays.asList();
        assertEquals(expected, proteinTranslator.translate("UAGUGG"));
    }

 
    @Test
    public void testTranslationStopsIfStopCodonAtEnd1() {
        List<String> expected = Arrays.asList("Tryptophan");
        assertEquals(expected, proteinTranslator.translate("UGGUAG"));
    }

 
    @Test
    public void testTranslationStopsIfStopCodonAtEnd2() {
        List<String> expected = Arrays.asList("Methionine", "Phenylalanine");
        assertEquals(expected, proteinTranslator.translate("AUGUUUUAA"));
    }

 
    @Test
    public void testTranslationStopsIfStopCodonInMiddle1() {
        List<String> expected = Arrays.asList("Tryptophan");
        assertEquals(expected, proteinTranslator.translate("UGGUAGUGG"));
    }

 
    @Test
    public void testTranslationStopsIfStopCodonInMiddle2() {
        List<String> expected = Arrays.asList("Tryptophan", "Cysteine", "Tyrosine");
        assertEquals(expected, proteinTranslator.translate("UGGUGUUAUUAAUGGUUU"));
    }

}
