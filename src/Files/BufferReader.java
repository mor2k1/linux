package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferReader {
    public static void main(String[] args) throws IOException { // can delete the catch part and use the throws except
        Scanner scanner = null;
        try{
            scanner = new Scanner(new BufferedReader(new FileReader("C:\\Users\\yuval\\IdeaProjects\\Main\\src\\Files\\newfile.txt")));
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                System.out.println(data);
            }

        }catch (IOException e){
            System.out.println(e);
        }finally {
            if(scanner != null){
                scanner.close();
            }
        }
    }
}
