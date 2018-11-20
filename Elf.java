
/**
 * Elf is a creature with HP between 8 and 25 and STR between 25 and 5.
 * Elf also has a 10% chance to deal double damage when attacking.
 * @author Luis Monterroso
 * @version November 11 2019
 */
public class Elf extends Creature
{
    // instance variables
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 25;
    private static final int MIN_ELF_STR = 5;
    
    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        // initialise instance variables
        super(
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP,    
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR
        );
    }
    
    /**
     * @override
     * Determines the damage done this round, first a number is rolled between 0 and 9,
     * if 9 is rolled then damage is doubled. Otherwise normal damage is dealt.
     * @return a value to be used for the damage done, between (1 -str) or 2 (1-str).
     */
    public int damage()
    {
        if (Randomizer.nextInt(9) == 9)
            return 2 * super.damage();
        else 
            return super.damage();
    }
    
    /**
     *  gives the name of the creatures race 
     *  @return the race of the creature(the name of the class). 
     */
    public String toString(){
        return "Elf";
    }
}
