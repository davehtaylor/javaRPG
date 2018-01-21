// Class for a player character

import java.util.ArrayList;

public class Player
{
    private String name;
    private int currentHP; 
    private int maxHP; 
    private int currentXP;
    private int currentLevel;

    private ArrayList<String> inventory = new ArrayList<String>();

    public Player(String name)
    {
        this.name = name;
        currentHP = maxHP = 100;
        inventory.add("fists");
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
        for (String item : inventory)
            System.out.println("- " + item);
    }

    public void addItem(String item)
    {
        item = item.toLowerCase();

        inventory.add(item);
    }

    public void dropItem(String item)
    {
        item = item.toLowerCase(); 

        // Make sure the user actually entered something
        if (item.isEmpty())
        {
            System.out.println("Choose an item to drop");
        }
        // Can't drop your fists
        else if (item.equals("fist") || item.equals("fists"))
        {
            System.out.println("** Your fists are attached to you **");
        }
        // Make sure the item is actually in the inventory
        else
        {
            if (inventory.contains(item))
            {
                inventory.remove(item);
                System.out.println("Dropped " + item);
            }
            else 
            {
                System.out.println("** " + item + " not in inventory **");
            }
        }
    }
}
