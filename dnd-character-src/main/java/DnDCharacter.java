import java.util.Random;

class DnDCharacter {

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int hitpoints;


    public DnDCharacter() {
        this.strength = ability();
        this.dexterity = ability();
        this.constitution = ability();
        this.intelligence = ability();
        this.wisdom = ability();
        this.charisma = ability();
        this.hitpoints = (10 + modifier(this.constitution));
    }

    int ability() {
        Random random = new Random();
        int score = random.nextInt(18);
        if (score <= 2) {
            score = 3;
        }
        return score;
    }


    int modifier(int input) {
        int health = (input - 10) / 2;
        if (input % 2 != 0) {
            if (input > 10) {
                health++;
            }
            health--;
        }
        return health;
    }


    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getHitpoints() {
        return hitpoints;
    }
}
