import java.util.Random;

public class Functions
{
     
    public Functions()
    {   

    }

    public static int getInitiative()
    {
        Random roller = new Random();
        int roll = roller.nextInt(20) + 1;

        return roll;
    }
    public static double getAttackMultiplier()
    {
        Random roller = new Random();
        int attack = ((roller.nextInt(2) + 1) / 100) + 1;

        return attack;
    }
    public static void endOfRound(Boss b, Soldier e)
    {
        System.out.println(" ");
        System.out.println(b.sendName() + " is at " + b.sendHealth());
        System.out.println(e.sendName() + " is at " + e.sendHealth());
        System.out.println(" ");
    }
    public static boolean compareInitiative(Boss b, Soldier e)
    {
        if(b.sendInitiative() - 1 > e.sendInitiative() - 1)
           {
               return true;
           }
           else if (b.sendInitiative() - 1< e.sendInitiative() - 1)
           {
               return false;
           }
           else { return true;}
    }
    public static void deathCheck(Boss b, Soldier e)
    {
        if(b.sendHealth() < 0)
        {
            b.makeDead();
            System.out.println(b.sendName() + " died.");
        }
        
        if(e.sendHealth() < 0)
        {
            e.makeDead();
            System.out.println(e.sendName() + " died.");
        }
    }
}