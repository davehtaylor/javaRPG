import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FindAndReplaceInFile
{
    public static void main(String[] args)
    {
        BufferedReader reader = null;
        FileWriter writer = null;
        File file = null;
        Scanner input = null;
        String line = "", oldText = "", replacedText;
        String inputFile = "chatSession.txt", outputFile = "chatSession2.txt";

        try
        {
            file = new File(inputFile);
            reader = new BufferedReader(new FileReader(file));

            while ((line = reader.readLine()) != null)
            {
                oldText += line + System.lineSeparator();
            }

            reader.close();

            replacedText = oldText.replaceAll("somename", "    dave");
            writer = new FileWriter(outputFile);
            writer.write(replacedText);

            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
    }
}
