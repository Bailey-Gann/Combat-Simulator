public class Arena
{

    public static void main(String[] args)
    {
        Boss boss1 = new Boss(Functions.getInitiative(), 100, "Kronos", 11);
        Soldier soldier1 = new Soldier(Functions.getInitiative(), 100, "Bob", 10);
        boolean turn;
        int turnNumber = 1;

        while(boss1.sendStatus() && soldier1.sendStatus())
        {
            
            double slam = Functions.getAttackMultiplier() * soldier1.sendAttack() * -1;
            double pound = Functions.getAttackMultiplier() * boss1.sendAttack() * -1;

           turn = Functions.compareInitiative(boss1, soldier1);
            
           if(turn == true)
           { soldier1.changeHealth(pound);
            Functions.deathCheck(boss1, soldier1);
             boss1.changeHealth(slam);
             Functions.deathCheck(boss1, soldier1);
            }
           else
           { boss1.changeHealth(slam);
            Functions.deathCheck(boss1, soldier1);
             soldier1.changeHealth(pound);
             Functions.deathCheck(boss1, soldier1);
            }
            

            turnNumber++;
            Functions.deathCheck(boss1, soldier1);
           Functions.endOfRound(boss1, soldier1);

        }
        
    }
}