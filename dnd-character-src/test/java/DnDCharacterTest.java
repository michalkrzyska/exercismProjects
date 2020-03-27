import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class DnDCharacterTest {

    private DnDCharacter dndCharacter = new DnDCharacter();

    @Test
    public void testAbilityModifierForScore3IsNegative4() { //done
        assertEquals(-4, dndCharacter.modifier(3));
    }

    
    @Test
    public void testAbilityModifierForScore4IsNegative3() { //done
        assertEquals(-3, dndCharacter.modifier(4));
    }

    
    @Test
    public void testAbilityModifierForScore5IsNegative3() { //done
        assertEquals(-3, dndCharacter.modifier(5));
    }

    
    @Test
    public void testAbilityModifierForScore6IsNegative2() { //done
        assertEquals(-2, dndCharacter.modifier(6));
    }

    
    @Test
    public void testAbilityModifierForScore7IsNegative2() { //done
        assertEquals(-2, dndCharacter.modifier(7));
    }

    
    @Test
    public void testAbilityModifierForScore8IsNegative1() { //done
        assertEquals(-1, dndCharacter.modifier(8));
    }

    
    @Test
    public void testAbilityModifierForScore9IsNegative1() { //done
        assertEquals(-1, dndCharacter.modifier(9));
    }

    
    @Test
    public void testAbilityModifierForScore10Is0() { //done
        assertEquals(0, dndCharacter.modifier(10));
    }

    
    @Test
    public void testAbilityModifierForScore11Is0() { //done
        assertEquals(0, dndCharacter.modifier(11));
    }

    
    @Test
    public void testAbilityModifierForScore12Is1() { //done
        assertEquals(1, dndCharacter.modifier(12));
    }

    
    @Test
    public void testAbilityModifierForScore13Is1() { //done
        assertEquals(1, dndCharacter.modifier(13));
    }

    
    @Test
    public void testAbilityModifierForScore14Is2() { //done
        assertEquals(2, dndCharacter.modifier(14));
    }

    
    @Test
    public void testAbilityModifierForScore15Is2() { //done
        assertEquals(2, dndCharacter.modifier(15));
    }

    
    @Test
    public void testAbilityModifierForScore16Is3() { //done
        assertEquals(3, dndCharacter.modifier(16));
    }

    
    @Test
    public void testAbilityModifierForScore17Is3() { //done
        assertEquals(3, dndCharacter.modifier(17));
    }

    
    @Test
    public void testAbilityModifierForScore18Is4() { //done
        assertEquals(4, dndCharacter.modifier(18));
    }

    
    @Test
    public void testRandomAbilityIsWithinRange() { //done
        for (int i = 0; i < 1000; i++) {
            int score = dndCharacter.ability();
            assertTrue(score > 2 && score < 19);
        }
    }

    
    @Test
    public void testRandomCharacterIsValid() {
        for (int i = 0; i < 1000; i++) {
            DnDCharacter character = new DnDCharacter();
            assertTrue(character.getStrength() > 2 && character.getStrength() < 19);
            assertTrue(character.getDexterity() > 2 && character.getDexterity() < 19);
            assertTrue(character.getConstitution() > 2 && character.getConstitution() < 19);
            assertTrue(character.getIntelligence() > 2 && character.getIntelligence() < 19);
            assertTrue(character.getWisdom() > 2 && character.getWisdom() < 19);
            assertTrue(character.getCharisma() > 2 && character.getCharisma() < 19);
            assertEquals(character.getHitpoints(),
                    10 + character.modifier(character.getConstitution()));
        }
    }

    
    @Test
    public void testEachAbilityIsOnlyCalculatedOnce() { //done
        assertEquals(dndCharacter.getStrength(), dndCharacter.getStrength());
    }

}
