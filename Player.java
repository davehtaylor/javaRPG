// Class for a player character

import java.util.ArrayList;

public class Player
{
    private String name;
    private int currentHP; 
    private int maxHP; 

    private ArrayList<String> inventory = new ArrayList<String>();

    public Player(String name)
    {
        this.name = name;
        currentHP = maxHP = 100;
        inventory.add("fists");
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

        if (item.isEmpty())
        {
            System.out.println("Choose an item to drop");
        }
        else if (item.equals("fist") || item.equals("fists"))
        {
            System.out.println("Your fists are attached to you");
        }
        else
        {
            inventory.remove(item);
            System.out.println("Dropped " + item);
        }
    }
}
