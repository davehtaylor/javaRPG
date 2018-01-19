import java.util.Scanner;

public class TestMain 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int mainMenuChoice, actionChoice, returnResult;
        String playerName, item, itemType;
        Player Player1;

        System.out.println("***** GAME TIME *****");
        System.out.println();
        System.out.println("1. Play Game");
        System.out.println("2. Exit");
        System.out.println();
        System.out.println("*********************");
        System.out.println();
        System.out.printf("Your selection: ");

        mainMenuChoice = input.nextInt();
        input.nextLine();

        if (mainMenuChoice != 1)
        {
            System.exit(0);
        }
        else
        {
            System.out.printf("What is your name: ");
            playerName = input.nextLine();
            Player1 = new Player(playerName);

            System.out.println();

            System.out.printf("Welcome, %s%n", Player1.getName());
            System.out.printf("Current HP: %d/%d%n",
                    Player1.getCurrentHP(), Player1.getMaxHP());

            System.out.println();

            System.out.println("What would you like to do?");
            System.out.println("1. Add item");
            System.out.println("2. Drop item");
            System.out.println("3. List items");

            System.out.println();
            System.out.printf("Your selection: ");

            actionChoice = input.nextInt();
            input.nextLine();

            switch (actionChoice)
            {
                case 1:
                    System.out.printf("What item? ");
                    item = input.nextLine();
                    Player1.addItem(item);
                    
                    System.out.printf("%nCurrent items:%n");
                    Player1.listItems();
                    break;
                case 2:
                    System.out.printf("What item? ");
                    item = input.nextLine();
                    Player1.dropItem(item);

                    System.out.printf("%nCurrent items:%n");
                    Player1.listItems();
                    break;
                case 3:
                    Player1.listItems();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
