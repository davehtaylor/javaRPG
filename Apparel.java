
public class Apparel extends Item
{
    private int defense;

    public Apparel(String name, int weight, int value, int defense)
    {
        super(name, weight, value);
        this.defense = defense;
    }

    public int getDefense()
    {
        return this.defense;
    }
}
