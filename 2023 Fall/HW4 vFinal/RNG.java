

public class RNG extends Main{
    public static void rng() {
        num1 = (int)(Math.random() * 10);
        num2 = (int)(Math.random() * 10);
        answer = num1 + num2;
        sub = num1 - num2;
        if (level == 1) {
            while (answer >= 10){
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
}//************End of the Class************