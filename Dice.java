// Class for a set of dice

import java.security.SecureRandom;

public class Dice
{
    // Pass in the number of dice to roll, and which dice to roll
    // e.g. 2d6 with an instance variable named "dice", it
    // would be dice.roll(2, "d6")
    public static int roll(int numOfDice, String nameOfDie)
    {
        int sumOfDice = 0, i;
        SecureRandom randomNumbers = new SecureRandom();

        for (i = 0; i < numOfDice; i++)
        {
            if (nameOfDie.equals("d4"))
                sumOfDice += (1 + randomNumbers.nextInt(4));
            else if (nameOfDie.equals("d6"))
                sumOfDice += (1 + randomNumbers.nextInt(6));
            else if (nameOfDie.equals("d8"))
                sumOfDice += (1 + randomNumbers.nextInt(8));
            else if (nameOfDie.equals("d10"))
                sumOfDice += (1 + randomNumbers.nextInt(10));
            else if (nameOfDie.equals("d12"))
                sumOfDice += (1 + randomNumbers.nextInt(12));
            else if (nameOfDie.equals("d20"))
                sumOfDice += (1 + randomNumbers.nextInt(20));
            else if (nameOfDie.equals("d100"))
                sumOfDice += (1 + randomNumbers.nextInt(100));
        }

        return sumOfDice;
    }
}
