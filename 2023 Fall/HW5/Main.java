import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.print("The numbers generated randomly are: ");

        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * 100 + 1);
            if (i != size - 1) {// Printing formating
            System.out.print(array[i] + ", ");
            }
            else if (i == size - 1) {
                System.out.print("and " + array[i]);
            }
        }

        System.out.println("\nThe sum of the array is " + Sum.sum(array, size - 1));
        input.close();
    }//End of main method
}//***** End of Class *****