// Class for a player character

import java.util.ArrayList;
import java.util.List;

public class Player
{
    // Basic player info
    private String      name;
    private int         currentHP;
    private int         maxHP;
    private int         currentXP;
    private int         currentLevel;
    private int         currentCarryWeight;
    private int         maxCarryWeight;
    private boolean     overencumbered;
    private Employers   employer;
    
    // Attributes
    private int         charisma;
    private int         constitution;
    private int         dexterity;
    private int         intelligence;
    private int         strength;
    private int         wisdom;

    // Skills
    private int         acrobatics;
    private int         athletics;
    private int         computerScience;
    private int         electronics;
    private int         insight;
    private int         intimidation;
    private int         investigation;
    private int         perception;
    private int         persuasion;
    private int         stealth;
    private int         survival;

    // Inventory
    // We can use the common superclass Item as the list type, and
    // then add each item subclass object to the list.
    private List<Item> inventory = new ArrayList<Item>();


    // Constructor
    //
    // We'll call this after we get the payer's name, so we have some
    // baselines set for the different variables. Then, we'll take the 
    // payer through a creation phase, where they can add points to 
    // attributes and skills as they prefer
    public Player(String name)
    {
        // Set the player basic info
        // We'll wait to set maxCarryWeight until after
        // all attribute and skill points have been allocated
        // since I'd like it to be a function of the player level
        // and strength
        this.name = name;
        this.currentHP = this.maxHP = 100;
        this.currentXP = 0;
        this.currentLevel = 1;
        this.currentCarryWeight = 1;
        this.employer = Employers.NONE;
        
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


    // So that we don't have 21 getters and 21 setters, we use one getter
    // and one setter that can return or manipulate all of the character stats
    //
    // Use the PlayerInfo enum to decide what stat to return to the caller
    // We're using Object as the return type since this might return a 
    // string or an int
    public Object getPlayerInfo(PlayerInfo info)
    {
        int returnValue;

        switch(info)
        {
            // Return basic player info
            case NAME:
                return this.name;
            case CURRENTHP:
                returnValue = this.currentHP;
                break;
            case MAXHP:
                returnValue = this.maxHP;
                break;
            case CURRENTXP:
                returnValue = this.currentXP;
                break;
            case CURRENTLEVEL:
                returnValue = this.currentLevel;
                break;
            case CURRENTCARRYWEIGHT:
                returnValue = this.currentCarryWeight;
                break;
            case MAXCARRYWEIGHT:
                returnValue = this.maxCarryWeight;
                break;
            case OVERENCUMBERED:
                return this.overencumbered;
            case EMPLOYER:
                return this.employer;

            // Return attribute value
            case CHARISMA:
                returnValue = this.charisma;
                break;
            case CONSTITUTION:
                returnValue =  this.constitution;
                break;
            case DEXTERITY:
                returnValue =  this.dexterity;
                break;
            case INTELLIGENCE:
                returnValue = this.intelligence;
                break;
            case STRENGTH:
                returnValue = this.strength;
                break;
            case WISDOM:
                returnValue = this.wisdom;
                break;

            // Return skill value
            case ACROBATICS:
                returnValue = this.acrobatics;
                break;
            case ATHLETICS:
                returnValue = this.athletics;
                break;
            case COMPUTERSCIENCE:
                returnValue = this.computerScience;
                break;
            case ELECTRONICS:
                returnValue = this.electronics;
                break;
            case INSIGHT:
                returnValue = this.insight;
                break;
            case INTIMIDATION:
                returnValue = this.intimidation;
                break;
            case INVESTIGATION:
                returnValue = this.intimidation;
                break;
            case PERCEPTION:
                returnValue = this.perception;
                break;
            case PERSUASION:
                returnValue = this.persuasion;
                break;
            case STEALTH:
                returnValue = this.stealth;
                break;
            case SURVIVAL:
                returnValue = this.survival;
                break;
            default:
                // Return int min if something fails
                return Integer.MIN_VALUE;
        }

        return returnValue;
    }


    // Set the player employer. We may end up having other player info
    // fields that need to be set, rather than incremented. And if so,
    // we'll overload this function
    public void setPlayerInfo(Employers employer)
    {
        this.employer = employer;
    }


    // Use the PlayerInfo enum to decide what stat to increment
    // or decrement. To increment, value should be positive. To
    // decrement, value should be negative
    public void incDecPlayerInfo(PlayerInfo info, int value)
    {
        switch(info)
        {
            // Change basic player info
            case NAME:
                // If they pass in the name, do nothing, since 
                // a name can't be incremented or decremented
                return;
            case CURRENTHP:
                this.currentHP += value;
                break;
            case MAXHP:
                this.maxHP += value;
                break;
            case CURRENTXP:
                this.currentXP += currentXP;
                break;
            case CURRENTLEVEL:
                this.currentLevel += value;
                break;
            case CURRENTCARRYWEIGHT:
                this.currentCarryWeight += value;
                break;
            case MAXCARRYWEIGHT:
                this.maxCarryWeight += value;
                break;
            case OVERENCUMBERED:
                // If they pass in the overencumbered, do nothing, since
                // boolean can't be incremented or decremented
                break;
            case EMPLOYER:
                // If they pass in the employer, do nothing, since
                // employer can't be incremented or decremented
                break;

            // Change attribute value
            case CHARISMA:
                this.charisma += value;
                break;
            case CONSTITUTION:
                this.constitution += value;
                break;
            case DEXTERITY:
                this.dexterity += value;
                break;
            case INTELLIGENCE:
                this.intelligence += value;
                break;
            case STRENGTH:
                this.strength += value;
                break;
            case WISDOM:
                this.wisdom += value;
                break;

            // Change skill value
            case ACROBATICS:
                this.acrobatics += value;
                break;
            case ATHLETICS:
                this.athletics += value;
                break;
            case COMPUTERSCIENCE:
                this.computerScience += value;
                break;
            case ELECTRONICS:
                this.electronics += value;
                break;
            case INSIGHT:
                this.insight += value;
                break;
            case INTIMIDATION:
                this.intimidation += value;
                break;
            case INVESTIGATION:
                this.investigation += value;
                break;
            case PERCEPTION:
                this.perception += value;
                break;
            case PERSUASION:
                this.persuasion += value;
                break;
            case STEALTH:
                this.stealth += value;
                break;
            case SURVIVAL:
                this.survival += value;
                break;
            default:
                // Otherwise, don't do anything
                return;
        }
    }


    // We'll print out the inventory items based on their class type. 
    // We'll do this by getting a value from an enum from the caller,
    // then check each object in the list to see if it's an instance of 
    // that class.
    //
    // Right now, this feels a bit brute-force-y. Will alter as I learn more.
    public void listItems(ItemType itemType)
    {
        int i = 1;

        switch (itemType)
        {
            case WEAPON:
                System.out.println("** Weapons **");
                
                for (Item item : this.inventory)
                {
                    if (item instanceof Weapon)
                    {
                        System.out.printf("%d. %s%n", i, item.getItemName());
                        System.out.printf(" - Weight: %d kilograms%n", item.getWeight());
                        System.out.printf(" - Value: %d credits%n", item.getValue());
                        System.out.printf(" - Damage: %d%n", ((Weapon)item).getDamage());
                        System.out.printf(" - Quest item? %b%n", item.getQuestState());
                        i++;
                    }
                }
                break;

            case APPAREL:
                System.out.println("** Apparel **");

                for (Item item : this.inventory)
                {
                    if (item instanceof Apparel)
                    {
                        System.out.printf("%d. %s%n", i, item.getItemName());
                        System.out.printf(" - Weight: %d kilograms%n", item.getWeight());
                        System.out.printf(" - Value: %d credits%n", item.getValue());
                        System.out.printf(" - Defense: %d%n", ((Apparel)item).getDefense());
                        System.out.printf(" - Quest item? %b%n", item.getQuestState());
                        i++;
                    }
                }
                break;

            case AIDITEM:
                System.out.println("** Aid Items **");

                for (Item item : this.inventory)
                {
                    if (item instanceof Apparel)
                    {
                        System.out.printf("%d. %s%n", i, item.getItemName());
                        System.out.printf(" - Weight: %d kilograms%n", item.getWeight());
                        System.out.printf(" - Value: %d credits%n", item.getValue());
                        System.out.printf(" - HP +%d%n", ((AidItem)item).getAidValue());
                        System.out.printf(" - Quest item? %b%n", item.getQuestState());
                        i++;
                    }
                }
                break;

            case MISCITEM:
                System.out.println("** Misc Items **");

                for (Item item : this.inventory)
                {
                    if (item instanceof MiscItem)
                    {
                        System.out.printf("%d. %s%n", i, item.getItemName());
                        System.out.printf(" - Weight: %d kilograms%n", item.getWeight());
                        System.out.printf(" - Value: %d credits%n", item.getValue());
                        System.out.printf(" - Quest item? %b%n", item.getQuestState());
                        i++;
                    }
                }
                break;

            default:
                return;
        }
    }


    // Add the item to the inventory, and update the player's carry weight.
    // If the weight exceeds the max, we'll flag that the player is
    // overencumbered. 
    //
    // Still need to do some input validation
    public void addItem(Item item)
    {
        inventory.add(item);

        this.currentCarryWeight += item.getWeight();

        if (currentCarryWeight > maxCarryWeight)
            this.overencumbered = true;
    }


    // Drop an item. We'll update the player's carry weight.
    // If the player is overencumbered, we want to see if dropping
    // the item changes that.
    //
    // Still need to do some input validation
    public void dropItem(Item item)
    {
        inventory.remove(item);

        this.currentCarryWeight -= item.getWeight();

        if (overencumbered == true)
            if (currentCarryWeight <= maxCarryWeight)
                this.overencumbered = false;
    }
}
