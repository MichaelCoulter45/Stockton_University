
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.ArrayList;
public class Baby {

    static int numName;
    static String boyName;
    static int boyNum;
    static double boyPercent;
    static String girlName;
    static int girlNum;
    static double girlPercent;
    static int totalBoys = 0;
    static int totalGirls = 0;
    static int totalBabies = totalBoys + totalGirls;

    public static void baby() throws FileNotFoundException {
        ArrayList <String> popNames = new ArrayList<String>();
        try {
            File inputFile = new File("babynames.txt");
            Scanner in = new Scanner(inputFile);
            PrintWriter boys = new PrintWriter("outputBoys.txt");// Creates an empty file. Also overwrites any file with the same name with an empty file.
            PrintWriter girls = new PrintWriter("outputGirls.txt");
        
            while (in.hasNextLine()) { // Reads the "in" file line by line. Then by each element in the read line.
                int numName = in.nextInt();
                String boyName = in.next();
                int boyNum = in.nextInt();
                double boyPercent = in.nextDouble();
                String girlName = in.next();
                int girlNum = in.nextInt();
                double girlPercent = in.nextDouble();

                boys.printf("%-12s",numName);// Writes to the boys file and then to the girls file.
                boys.printf("%12s",boyName);
                boys.printf("%12s",boyNum);
                boys.printf("%12.4f",boyPercent);
                boys.println();
                girls.printf("%-12s",numName);
                girls.printf("%12s",girlName);
                girls.printf("%12s",girlNum);
                girls.printf("%12.4f", girlPercent);
                girls.println();
                totalBoys += boyNum;
                totalGirls += girlNum;
                totalBabies = totalBoys + totalGirls;
                if (totalBabies <= 10000000) {
                    popNames.add(boyName);
                    popNames.add(girlName);
                }
            }//End of [while (in.hasNextLine())] block.

            in.close(); // Closes the files.
            boys.close();
            girls.close();
        }// End of try block.

        catch (FileNotFoundException e) { // Replaces this error message with a more user friendly message.
            System.out.println("*** File not found. Please check the file name and try again. ***");
        } //End of catch block.
        

        System.out.println("Total boys born this year: " + totalBoys);
        System.out.println("Total girls born this year: " + totalGirls);
        System.out.println("Total babies born this year: " + totalBabies);
        System.out.println("The most popular names that reach 10,000,000 are: \n" + popNames + "\n");
    }   // End of baby method;
}// End of class Baby;
















/*
 * Trash code. Maybe useful later...
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 

int numName = in.nextInt();
                String boyName = in.next();
                int boyNum = in.nextInt();
                double boyPercent = in.nextDouble();
                String girlName = in.next();
                int girlNum = in.nextInt();
                double girlPercent = in.nextDouble();




public Main(int numName, String boyName, int boyNum, double boyPercent, String girlName, int girlNum, double girlPercent) {
        this.numName = numName;
        this.boyName = boyName;
        this.boyNum = boyNum;
        this.boyPercent = boyPercent;
        this.girlName = girlName;
        this.girlNum = girlNum;
        this.girlPercent = girlPercent;
    }//End of Baby constructor.

















        while (in.hasNextDouble()) { // Reading Text file for numbers.
            double value = in.nextDouble();
            total += value;
            count++;
            out.printf("%15.2f", value); // Formatted output. (15 characters wide, 2 decimal places)
            // if (count % 2 == 0) { out.println();} // Prints a new line every 2 numbers. Creating a 2 column table.
            
            // Process value...
        }// End of while loop.





        /*
        while (!done) {
        while (in.hasNextInt()) { // Reading Text file for Ints.
            int value = in.nextInt();
            total += value; 
            
        }







/* 
        while (in.hasNext()) { // Reading the Text for Strings.
            name = in.next(); // name = next string.
            count++;
            
            if (count <= 4) { male = true; boys.printf("%-12s", name); } // Prints to boys.txt and formats each string to 12 characters wide.
            if (count > 4 || count == 1) { male = false; girls.printf("%-12s", name);} // Prints to girls.txt and formats each string to 12 characters wide.
            if (count == 7) { boys.println(); girls.println(); count = 0;} // Prints a new line every 7 strings for both files. Creating a 4 column table for both.
        }// End of while loop.







while (in.hasNext()) {
                count++;
                if (count == 1) { numBoys++; totalBoys += numBoys; boys.printf("%-12d", numBoys); } // Reads the first number in the line and adds it to the totalBoys.
                if (count == 2) { name = in.next(); boys.printf("%-12d", numBoys); break;}
                if (count == 3)
                if (count == 4)
                if (count == 5)
                if (count == 6)
                if (count == 7) { boys.println(); girls.println(); count = 0; } // Prints a new line every 7 strings for both files. Creating a 4 column table for both.
            }//End of while loop.













        while (!done) {
        String line = in.nextLine(); // Reads and TAKES the line of text.

            // Boy names..
            for  (int i = 0; i < line.length(); i++) {

                
                while (!Character.isDigit(line.charAt(i))) { // Locating the first digit in the line.
                    i++; 
                } 
                name = line.substring(i+1); // Getting the name of the baby.

                boys.printf("%-12d", numBoys);
                boys.printf("%12s", name);

            
            }

            // Girl names..
            if (male > 4 || count == 1) {


        
            }
            if (male == 7) { male = 0; }

            done = true;
        } // End of !done while loop.


*/
