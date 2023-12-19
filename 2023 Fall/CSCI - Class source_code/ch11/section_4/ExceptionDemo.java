import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionDemo
{
   public static void main(String[] args)
   {
      String inputValues = "two 42 43 three 44 ";
      // This scanner reads the values from the given string. 
      Scanner in = new Scanner(inputValues);
      boolean done = false;
      while (!done)
      {
         try
         {	       
            int n = in.nextInt();
            System.out.println("Read integer " + n);
            if (n == 42) { throw new IllegalArgumentException("Ugh! 42"); }
            String str = in.next();
            System.out.println("Read string " + str);
            n = Integer.parseInt(str);
            System.out.println("Parsed integer " + n);	
         }
         catch (NumberFormatException ex)
         {
            System.out.println(ex.getMessage());
         }
         catch (IllegalArgumentException ex)
         {
            System.out.println(ex.getMessage());
         }
         catch (InputMismatchException ex) 
         {
            // We "fix" the problem by removing the offending input
            System.out.println("Removing " + in.next()); 
         }
         catch (NoSuchElementException ex) // This happens at the end of the input
         {
            ex.printStackTrace();
            System.out.println("Terminating the loop.");
            done = true;
         }
      }
   }
}
