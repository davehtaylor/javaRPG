
public class Weapon extends Item
{
    private int damage;

    public Weapon(String name, int weight, int value, int damage)
    {
        super(name, weight, value);
        this.damage = damage;
    }

    public int getDamage()
    {
        return this.damage;
    }
}
