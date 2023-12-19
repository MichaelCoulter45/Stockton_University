import java.util.Scanner;

public class ScoreTester1
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      Student fred = new Student(100);
      fred.addScore(10);
      fred.addScore(20);
      fred.addScore(5);
      System.out.println("Final score: " + fred.finalScore());
      System.out.println("Expected: 30");
   }
}
