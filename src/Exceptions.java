import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args){
        System.out.println(calc());
    }

    public static int calc(){
        int x = getInput();
        int y = getInput();
        try{
            return x / y;
        }catch(ArithmeticException e){
            throw new ArithmeticException("You tried to divide by zero... ");
        }
    }

    public static int getInput(){
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number: ");
            try{
                return scanner.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Enter a valid number...");
            }
        }
    }
}
