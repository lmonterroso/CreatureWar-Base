
/**
 * The Cyber Demon is a beefier unit with HP between 80 and 100 and STR between 20 and 40.
 * Demon has no special attack attribute.
 * @author Luis Monterroso
 * @version November 11 2019
 */
public class CyberDemon extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_CYBERDEMON_HP = 100;
    private static final int MIN_CYBERDEMON_HP = 80;
    private static final int MAX_CYBERDEMON_STR = 40;
    private static final int MIN_CYBERDEMON_STR = 20;

    /**
     * Constructor for objects of class CYBERDEMON
     */
    public CyberDemon()
    {
        // initialise instance variables
        super(
            Randomizer.nextInt(MAX_CYBERDEMON_HP-MIN_CYBERDEMON_HP)+MIN_CYBERDEMON_HP,    
            Randomizer.nextInt(MAX_CYBERDEMON_STR-MIN_CYBERDEMON_STR)+MIN_CYBERDEMON_STR
        );
    }
    
    /**
     *  gives the name of the creatures race 
     *  @return the race of the creature(the name of the class). 
     */
    public String toString(){
        return "Cyber Demon";
    }
}
