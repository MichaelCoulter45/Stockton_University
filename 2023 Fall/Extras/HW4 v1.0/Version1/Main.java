package Version1;
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
        System.out.println("Welcome to Level " + level + "!");
        System.out.println("Score: " + score);
        level1();

    }//End of the main method.
    public static void rng() {
        num1 = (int)(Math.random() * 10);
        num2 = (int)(Math.random() * 10);
        answer = num1 + num2;
        sub = num1 - num2;
        if (level == 1) {
            while (answer > 10){
                num1 = (int)(Math.random() * 10);
                num2 = (int)(Math.random() * 10);
                answer = num1 + num2;
        }
    }
        else if (level == 2) {
            num1 = (int)(Math.random() * 10);
            num2 = (int)(Math.random() * 10);
            answer = num1 + num2;
    }
        else if (level == 3) {
            while (sub < 0) {
                num1 = (int)(Math.random() * 10);
                num2 = (int)(Math.random() * 10);
                sub = num1 - num2;
            }
        }
    }//End of the rng method.
    public static void level1(){
        System.out.println();
        System.out.println("Level: " + level);
        System.out.println("Score: " + score);
        System.out.println(" ");
        rng();
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
                level2();
                
            }
        }
        else {
            System.out.println("Incorrect!");
            attempt++;
            if (attempt < 2){
                level1();
            }
            else {
                System.out.println("Game Over!");
            }
        }
    }//End of the level1 method.
    public static void level2(){ //LEVEL 2
        System.out.println();
        System.out.println("Score: " + score);
        System.out.println("Level: " + level);
        System.out.println(" ");
        rng();
        System.out.println("What is " + num1 + " + " + num2 + "?");
        response = input.nextInt();
        if (response == answer){
            System.out.println("Correct!");
            score++;
            attempt = 0;
            if (score < 5){
                level2();
            }
            else {
                level++;
                score = 0;
                level3();
            }
        }
        else {
            System.out.println("Incorrect!");
            attempt++;
            if (attempt < 2){
                level2();
            }
            else {
                System.out.println("Game Over!");
            }
        }
    }//End of the level2 method.
    public static void level3(){
        System.out.println();
        System.out.println("Score: " + score);
        System.out.println("Level: " + level);
        System.out.println(" ");
        rng();
        System.out.println("What is " + num1 + " - " + num2 + "?");
        response = input.nextInt();
        if (response == sub){
            System.out.println("Correct!");
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
                System.out.println("Game Over!");
            }
        }
    }//End of the level3 method.

}//************ End of CLASS ************





/*
 * 1. Display "start game"
2. Display "welcome to level 1"
        score = 0
        
	3. num1 = random number generator (1-9)
	4. num2 = random number generator (1-9)
	5. answer = num1 +num2
	6. Check is answer < 10? Yes or No
		7-1. if yes, Display question 
        example: what is num1+num2?
		8. response = student's answer
		9  if(response == answer)?
		10. if yes, score++, attempt =0
				if (score < 5)
					repeat 3 to 9
				else
				move to level 2	
		11. if no: 
				display wrong 
				attempt++ 
				if (attempt < 2)
                        repeat 7-1 to 9	     	
                                else
					end game
                7-2. if no, repeat step 3 to 6

2. Display "welcome to level 2"
        score = 0
        
	3. num1 = random number generator (1-9)
	4. num2 = random number generator (1-9)
	5. answer = num1 +num2
	//6. Check is answer < 10? Yes or No
	7(//-1. if yes, )Display question 
        example: what is num1+num2?
		8. response = student's answer
		9  if(response == answer)?
	10. if yes, score++, attempt =0
				if (score < 5)
					repeat 3 to 9
				else
				move to level 3	
		11. if no: 
				display wrong 
				attempt++ 
				if (attempt < 2)
                        repeat 7-1 to 9	     	
                                else
					end game
              //  7-2. if no, repeat step 3 to 6

2. Display "welcome to level 3"
        score = 0
        
	3. num1 = random number generator (1-9)
	4. num2 = random number generator (1-9)
	5. answer = num1 - num2
	6. Check is answer >= 0? Yes or No
		7-1. if yes, Display question 
        example: what is num1+num2?
		8. response = student's answer
		9  if(response == answer)?
	10. if yes, score++, attempt =0
				if (score < 5)
					repeat 3 to 9
				else
				end game	
		11. if no: 
				display wrong 
				attempt++ 
				if (attempt < 2)
                        repeat 7-1 to 9	     	
                                else
					end game
                7-2. if no, repeat step 3 to 6
 */