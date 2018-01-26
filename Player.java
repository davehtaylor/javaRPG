// Class for a player character

import java.util.ArrayList;

public class Player
{
    // Basic player info
    private String  name;
    private int     currentHP;
    private int     maxHP;
    private int     currentXP;
    private int     currentLevel;
    
    // Attributes
    private int     strength;
    private int     dexterity;
    private int     constitution;
    private int     intelligence;
    private int     wisdom;
    private int     charisma;

    // Skills
    private int     acrobatics;
    private int     athletics;
    private int     computerScience;
    private int     electronics;
    private int     insight;
    private int     intimidation;
    private int     investigation;
    private int     perception;
    private int     persuasion;
    private int     stealth;
    private int     survival;

    // Inventory
    private ArrayList<Item> inventory = new ArrayList<Item>();

    // Constructor
    public Player(String name)
    {
        this.name = name;
        this.currentHP = this.maxHP = 100;
        this.currentXP = 0;
        this.currentLevel = 1;
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
        int i = 1;

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
