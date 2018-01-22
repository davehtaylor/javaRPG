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

        System.out.printf("Your selection: ");

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
        // figure out our attributes and skills system

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

        // Print main menu
        printMainMenu();

        // Create character
        Player1 = characterCreation(Player1);
        
        // Adding items to test things out
        newItem = new Item("Computer", 5, 100);
        newItem2 = new Item("Flashlight", 1, 5);
        Player1.addItem(newItem);
        Player1.addItem(newItem2);

        System.out.printf("%nWelcome, %s%n", Player1.getName());
        System.out.printf("Current HP: %d/%d%n",
                Player1.getCurrentHP(), Player1.getMaxHP());
        System.out.printf("Current XP: %d%n", Player1.getCurrentXP());
        System.out.printf("Current level: %d%n", Player1.getCurrentLevel());
        System.out.println("Current items:");
        Player1.listItems();
    }
}
