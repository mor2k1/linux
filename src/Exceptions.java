import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args){
        System.out.println(calc());
    }

    public static int calc(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        try{
            int data = s.nextInt();
            s.close();
            return data;
        }catch (InputMismatchException e){
            s.close();
            return 0;
        }
    }
}
