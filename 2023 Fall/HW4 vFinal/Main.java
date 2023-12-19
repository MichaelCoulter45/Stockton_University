
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static int score = 0;
    static int level = 1;
    static int attempt = 0;
    static int response;
    static int answer;
    static int num1;
    static int num2;
    static int sub;
    
    public static void main(String[]args) {
        System.out.println("\nWelcome to the Math Game!");
        System.out.println("You will be asked to answer 5 questions per level.");
        System.out.println("You will have 2 attempts per question.");
        System.out.println("Good Luck!");
        System.out.println(" ");
        System.out.println("Welcome to level " + level + "!");
        Level1.level1();
        input.close();
    }//End of the main method.
}//************ End of CLASS ************
