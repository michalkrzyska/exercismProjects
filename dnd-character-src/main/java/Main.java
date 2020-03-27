import java.io.DataInputStream;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        DnDCharacter dnDCharacter = new DnDCharacter();
        System.out.println(dnDCharacter.getConstitution());
        System.out.println(dnDCharacter.modifier(dnDCharacter.getConstitution()));
        System.out.println(10 + dnDCharacter.modifier(dnDCharacter.getConstitution()));
        System.out.println(dnDCharacter.getHitpoints());

    }
//        for (int i = 0; i < 1000; i++) {
//            DnDCharacter character = new DnDCharacter();
//            System.out.println(character.getStrength() > 2 && character.getStrength() < 19);
//            System.out.println(character.getDexterity() > 2 && character.getDexterity() < 19);
//            System.out.println(character.getConstitution() > 2 && character.getConstitution() < 19);
//            System.out.println(character.getIntelligence() > 2 && character.getIntelligence() < 19);
//            System.out.println(character.getWisdom() > 2 && character.getWisdom() < 19);
//            System.out.println(character.getCharisma() > 2 && character.getCharisma() < 19);
//            System.out.println(character.getHitpoints() + (10 + character.modifier(character.getConstitution())));
//        }

    }
