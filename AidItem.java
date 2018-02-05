
public class AidItem extends Item
{
    private int aidValue;

    public AidItem(String name, int weight, int value, int aidValue)
    {
        super(name, weight, value);
        this.aidValue = aidValue;
    }

    public int getAidValue()
    {
        return this.aidValue;
    }
}
