
/**
 * Demon is a special creature with HP between 15 and 30 and Str between 10 and 15.
 * Demon also has a 5% chance to deal 50 bonus damage.
 * @author Luis Monterroso
 * @version November 11 2019
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your ow
    private static final int MAX_DEMON_HP = 30;
    private static final int MIN_DEMON_HP = 15;
    private static final int MAX_DEMON_STR = 15;
    private static final int MIN_DEMON_STR = 10;
    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        super(
            Randomizer.nextInt(MAX_DEMON_HP-MIN_DEMON_HP)+MIN_DEMON_HP,    
            Randomizer.nextInt(MAX_DEMON_STR-MIN_DEMON_STR)+MIN_DEMON_STR
        );
    }
    
    /**
     * @override
     * Calculates the damage done this round, 
     * if a 19 is rolled then the creature does 50 bonus damage.
     * @return a value between 1 and str (+50 if 5% chance succeeds)
     * to be used to cause damage to another creature
     */
    public int damage()
    {
        if (Randomizer.nextInt(19) == 19)
            return 50 + super.damage();
        else 
            return super.damage();
    }
}
