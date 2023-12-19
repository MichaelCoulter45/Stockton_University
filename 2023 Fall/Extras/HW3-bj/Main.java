import java.io.FileNotFoundException; // Imports the FileNotFoundException class from the java.io package.
public class Main {
    Baby baby = new Baby(); // Creates a new Baby object from Baby.java.
    public static void main(String[] args) throws FileNotFoundException{
        try {
        Baby.baby(); // Runs the baby method [baby()] from Baby.java [Baby.xx()].
        }
        catch (FileNotFoundException e) { // Catches the FileNotFoundException error.
            System.out.println("*** File not found. Please check the file name and try again. ***");
        }
    }//End of Main method.
}//End of Main class.