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
    private int     carryWeightLimit;
    
    // Attributes
    private int     charisma;
    private int     constitution;
    private int     dexterity;
    private int     intelligence;
    private int     strength;
    private int     wisdom;

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

    // Inventory. 
    //
    // I think we'll need separate arrays for different
    // types of times. e.g. one for weapons, one for apparel, one
    // for misc items, etc. But each item type should be a child object
    // of the item class
    private ArrayList<Item> inventory = new ArrayList<Item>();


    // Constructor
    //
    // We'll call this after we get the payer's name, so we have some
    // baselines set for the different variables. Then, we'll take the 
    // payer through a creation phase, where they can add points to 
    // attributes and skills as they prefer
    public Player(String name)
    {
        // Set the player basic info
        // We'll wait to set carryWeightLimit until after
        // all attribute and skill points have been allocated
        // since I'd like it to be a function of the player level
        // and strength
        this.name = name;
        this.currentHP = this.maxHP = 100;
        this.currentXP = 0;
        this.currentLevel = 1;
        
        // Set the attributes to a baseline of 5
        this.charisma = 5;
        this.constitution = 5;
        this.dexterity = 5;
        this.intelligence = 5;
        this.strength = 5;
        this.wisdom = 5;
        
        // Set the skills to a baseline of 1
        this.acrobatics = 1;
        this.athletics = 1;
        this.computerScience = 1;
        this.electronics = 1;
        this.insight = 1;
        this.intimidation = 1;
        this.investigation = 1;
        this.perception = 1;
        this.persuasion = 1;
        this.stealth = 1;
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
