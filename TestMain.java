import java.util.Scanner;

public class TestMain
{
    public static void printMainMenu()
    {
        Scanner input = new Scanner(System.in);
        int mainMenuChoice;

        System.out.printf("***** GAME TIME *****%n%n");
        System.out.printf("1. Play Game%n");
        System.out.printf("2. Exit%n%n");
        System.out.printf("*********************%n%n");

        System.out.printf("> ");	//changed to a symbol rather than text prompt.

        mainMenuChoice = input.nextInt();
        input.nextLine();

        if (mainMenuChoice != 1)
            System.exit(0);
        else
            return;
    }


    public static Player characterCreation(Player player)
    {
        // We can add more to this function as we
        // figure out our attributes and skills systemcd S

        Scanner input = new Scanner(System.in);
        String name;

        System.out.printf("%n*** Create your character ***%n%n");

        System.out.printf("Name: ");
        name = input.nextLine();

        player = new Player(name);

        return player;
    }


    public static void main(String[] args)
    {
        Player Player1 = null;
        Item newItem = null;
        Item newItem2 = null;
        Area playArea = null;
        double[] start = {0,0};

        // Print main menu
        printMainMenu();

        // Create character
        Player1 = characterCreation(Player1);

        // Adding items to test things out
        newItem = new Weapon("Pistol", 5, 100, 10);
        newItem2 = new Apparel("Jacket", 5, 5, 20);
        Player1.addItem(newItem);
        Player1.addItem(newItem2);

        System.out.printf("%nWelcome, %s%n", 
               Player1.getPlayerInfo(PlayerInfo.NAME));
        System.out.printf("Current HP: %d/%d%n",
               Player1.getPlayerInfo(PlayerInfo.CURRENTHP), 
               Player1.getPlayerInfo(PlayerInfo.MAXHP));
        System.out.printf("Current XP: %d%n", 
               Player1.getPlayerInfo(PlayerInfo.CURRENTXP));
        System.out.printf("Current level: %d%n", 
               Player1.getPlayerInfo(PlayerInfo.CURRENTLEVEL));
        System.out.printf("Current carry weight: %d%n",
               Player1.getPlayerInfo(PlayerInfo.CURRENTCARRYWEIGHT));
//        Player1.listItems();
        Player1.listItems(ItemType.WEAPON);
        Player1.listItems(ItemType.APPAREL);

        System.out.printf("%nDropping %s%n", newItem2.getItemName());
        Player1.dropItem(newItem2);
        Player1.listItems(ItemType.APPAREL);
        System.out.printf("Current carry weight: %d%n",
               Player1.getPlayerInfo(PlayerInfo.CURRENTCARRYWEIGHT));

        playArea = new Area("Open Field", 100 , 100 , start , false, true);
        
        // Testing the getter and setters
        // First return the strength
        System.out.printf("Player strength: %d%n",
               Player1.getPlayerInfo(PlayerInfo.STRENGTH)); 
        // Increment it
        System.out.println("Incrementing player strength by 2");
        Player1.incDecPlayerInfo(PlayerInfo.STRENGTH, 2);
        System.out.printf("Player strength: %d%n",
               Player1.getPlayerInfo(PlayerInfo.STRENGTH)); 
        // Then decrement it
        System.out.println("Decrementing player strength by 2");
        Player1.incDecPlayerInfo(PlayerInfo.STRENGTH, (-2));
        System.out.printf("Player strength: %d%n",
               Player1.getPlayerInfo(PlayerInfo.STRENGTH));
    }
}
