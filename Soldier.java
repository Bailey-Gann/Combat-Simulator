public class Soldier
{
    private int initiative;
    private double health;
    private String name;
    private double attack;
    private boolean alive = true;

    public Soldier(int initiative, double health, String name, double attack)
    {
        this.initiative = initiative;
        this.health = health;
        this.name = name;
        this.attack = attack;
    }
    public int sendInitiative()
    {
        return this.initiative;
    }
    public double sendHealth()
    {
        return this.health;
    }
    public void changeHealth(double h)
    {
        this.health = health + h;
    }
    public String sendName()
    {
        return this.name;
    }
    public double sendAttack()
    {
        return this.attack;
    }
    public boolean sendStatus()
    {
        return this.alive;
    }
    public void makeDead()
    {
        this.alive = false;
    }

}