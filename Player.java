// Class for a player character

import java.util.ArrayList;

// hi Dave!
public class Player
{
    private String name;
    private int currentHP;
    private int maxHP;
    private int currentXP;
    private int currentLevel;
    private int i;

    private ArrayList<Item> inventory = new ArrayList<Item>();

    public Player(String name)
    {
        this.name = name;
        currentHP = maxHP = 100;
        currentXP = 0;
        currentLevel = 1;
    }

    public String getName()
    {
        return name;
    }

    public int getCurrentHP()
    {
        return currentHP;
    }

    public int getMaxHP()
    {
        return maxHP;
    }

    public int getCurrentXP()
    {
        return currentXP;
    }

    public int getCurrentLevel()
    {
        return currentLevel;
    }

    public void listItems()
    {
        i = 1;

        for (Item item : inventory)
        {
            System.out.printf("%d. %s%n", i, item.getItemName());
            System.out.printf(" - Weight: %d kilograms%n", item.getWeight());
            System.out.printf(" - Value: %d credits%n", item.getValue());
            System.out.printf(" - Quest item? %b%n", item.getQuestState());
            i++;
        }
    }

    public void addItem(Item item)
    {
        inventory.add(item);
    }

    public void dropItem(Item item)
    {
        inventory.remove(item);
    }
}
