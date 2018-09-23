import java.util.Scanner;
import java.io.*;

class Question1
{
    public static void main(String[] input)
    {
        String fname;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter File Name to Open (with extension like file.txt) : ");
        fname = scan.nextLine();
        String line = null;
        try
        {
            FileReader f = new FileReader(fname);
            BufferedReader b = new BufferedReader(f);   
            while((line = b.readLine()) != null)
            {
                System.out.println(line);
            }
            b.close();
        }
        catch(IOException ex)
        {
            System.out.println("Error reading file named '" + fname + "'");
        }
    }
}
