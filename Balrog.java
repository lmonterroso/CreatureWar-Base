
/**
 * The strongest creature by far the Balrog has HP between 80 and 200 and STR between 100 and 50.
 * The Balrog also attacks twice every round.
 * @author Luis Monterroso
 * @version November 11 2019
 */
public class Balrog extends Demon
{
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;

    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        // initialise instance variables
        super(
            Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP,    
            Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR
        );
    }

    /**
     * @override
     * Calculates the damage done this round, each attack is counted seperately and then added together.
     * @return the sum of both attacks giving the total damage dealt.
     */
    public int damage()
    {   
        return super.damage() + super.damage();
    }
    
    /**
     *  gives the name of the creatures race 
     *  @return the race of the creature(the name of the class). 
     */
    public String toString(){
        return "Balrog";
    }
}
