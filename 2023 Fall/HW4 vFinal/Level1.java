

public class Level1 extends Main {
    public static void level1(){
        System.out.println();
        System.out.println("** Level: " + level);
        System.out.println("** Score: " + score);
        System.out.println("** Attempt: " + attempt + " of 2");
        System.out.println();
        RNG.rng();
        System.out.println("What is " + num1 + " + " + num2 + "?");
        response = input.nextInt();
        if (response == answer){
            System.out.println("Correct!");
            score++;
            attempt = 0;
            if (score < 5){
                level1();
            }
            else {
                level++;
                score = 0;
                System.out.println("\n!!! Welcome to level " + level + " !!!");
                Level2.level2();
                
            }
        }
        else {
            System.out.println("Incorrect!");
            attempt++;
            if (attempt < 2){
                level1();
            }
            else {
                System.out.println("Starting over!");
                score = 0;
                attempt = 0;
                level1();
            }
        }
    }//End of the level1 method.
}//*********End of the class**********