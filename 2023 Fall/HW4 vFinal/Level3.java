

public class Level3 extends Main {
    public static void level3(){
        System.out.println();
        System.out.println("** Level: " + level);
        System.out.println("** Score: " + score);
        System.out.println("** Attempt: " + attempt + " of 2");
        System.out.println();
        RNG.rng();
        System.out.println("What is " + num1 + " - " + num2 + "?");
        response = input.nextInt();
        if (response == sub){
            System.out.println("Correct!\n");
            score++;
            attempt = 0;
            if (score < 5){
                level3();
            }
            else {
                System.out.println("Game Over! You Win!!!");
            }
        }
        else {
            System.out.println("Incorrect!");
            attempt++;
            if (attempt < 2){
                level3();
            }
            else {
                System.out.println("Starting over!");
                score = 0;
                attempt = 0;
                level3();
            }
        }
    }//End of the level3 method.
}//*********End of the class**********