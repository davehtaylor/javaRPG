
public class Item
{
	private String name;
	private int level;
	private int weight;
	private int value;
	private boolean questState;

	public Item(String name, int weight, int value)
	{
		this.name = name;
		this.weight = weight;
		this.value = value;
		this.level = 1;
		this.questState = false;
	}

	public String getItemName()
	{
		return name;
	}

	public int getWeight()
	{
		return weight;
	}

	public int getValue()
	{
		return value;
	}

	public int getLevel()
	{
		return level;
	}

    public boolean getQuestState()
    {
        return questState;
    }

	public void setQuestState(boolean state)
	{
		questState = state;
	}
}
