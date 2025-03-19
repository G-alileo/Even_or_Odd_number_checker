import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public String EvenorOddChecker(int user_value){
       if(user_value % 2 == 0){
        return "Even";
       }
        return "Odd";
    }

    public static void main(String[] args) {

        // creating variables
        int user_val = 0;
        boolean validity = true;

        // creating an object of the scanner class

        Scanner user_value = new Scanner(System.in);
        Main obj = new Main();

        while (validity) {
            try {
                System.out.println("====================================================");
                System.out.print("Enter your value: ");
                user_val = user_value.nextInt();
                System.out.println("====================================================");
                String result = obj.EvenorOddChecker(user_val);
                System.out.println(  "\n" + "Result : "  + user_val +" is " +result +"\n");

            } catch (InputMismatchException e) {
                System.out.println("ERROR : Invaid input type.");
                System.out.println("Exiting.......goodbye");
                System.out.println("====================================================");
                user_value.close();
                validity = false;

            }
        }
    }
}