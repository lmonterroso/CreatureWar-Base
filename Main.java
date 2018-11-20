import java.util.ArrayList;
/**
 * Write a description of class Main here.
 *
 * @author Luis Monterroso
 * @version November 11 2019
 */
public class Main
{
    /**
     * main method used to create the war.
     */
    public static void main(String[] args){
        ArrayList<Creature> army1 = new ArrayList<Creature>();
        ArrayList<Creature> army2 = new ArrayList<Creature>();
        
        army1.add(new Elf());
        army1.add(new Elf());
        army1.add(new Elf());
        army1.add(new Elf());
        army1.add(new Elf());
        army1.add(new Elf());
        army1.add(new Elf());
        army1.add(new Elf());
        army1.add(new Elf());
        army1.add(new Elf());
        army1.add(new Elf());
        army1.add(new Elf());
        
        army2.add(new Balrog());
        
        
        
        doBattle(army1, army2);
        
        
    }
    
    public static void doBattle(ArrayList<Creature> army1, ArrayList<Creature> army2){
        while (!(army1.isEmpty() || army2.isEmpty())){
            while(army1.get(0).isAlive() && army2.get(0).isAlive()){
                System.out.print("Army 2 " + army2.get(0) + " attacks and deals ");
                army1.get(0).takeDamage(army2.get(0).damage());
                System.out.print("Army 1 " + army1.get(0) + " attacks and deals ");
                army2.get(0).takeDamage(army1.get(0).damage());
            }
            
            if (army1.get(0).isDead()){
                System.out.println("Army 1 " + army1.get(0) + " died");
                army1.remove(0);
            }
            if ( army2.get(0).isDead()){
                System.out.println("Army 2 " + army2.get(0) + " died");
                army2.remove(0);
            }
            System.out.println("");
        }
        
        if (army1.isEmpty()){
            if (army2.isEmpty()){
                System.out.println("It's a draw");
            }
            else {
                System.out.println("Army 2 has won!");
                System.out.println("They had " + army2.size() + " soldiers left");
            }
        }
        else {
            System.out.println("Army 1 has won!");
            System.out.println("They had " + army1.size() + " soldiers left");
        }
        
    }

    
}
