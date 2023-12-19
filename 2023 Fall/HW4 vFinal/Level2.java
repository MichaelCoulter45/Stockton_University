

public class Level2 extends Main {
    public static void level2(){ //LEVEL 2
        System.out.println();
        System.out.println("** Level: " + level);
        System.out.println("** Score: " + score);
        System.out.println("** Attempt: " + attempt + " of 2");
        System.out.println();
        RNG.rng();
        System.out.println("What is " + num1 + " + " + num2 + "?");
        response = input.nextInt();
        if (response == answer){
            System.out.println("Correct!\n");
            score++;
            attempt = 0;
            if (score < 5){
                level2();
            }
            else {
                level++;
                score = 0;
                System.out.println("\n!!! Welcome to level " + level + " !!!");
                Level3.level3();
            }
        }
        else {
            System.out.println("Incorrect!");
            attempt++;
            if (attempt < 2){
                level2();
            }
            else {
                System.out.println("Starting over!");
                score = 0;
                attempt = 0;
                level2();
            }
        }
    }//End of the level2 method.
}//*********End of the class**********