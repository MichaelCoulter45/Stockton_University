
public class Sum extends Main {
    public static int sum(int[] array, int index) {
        if (index == 0) {
            return array[index];
        } else {
            return array[index] + sum(array, index - 1);
        }

    }//End of sum method
}//***** End of Class *****
