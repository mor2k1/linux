package Files;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(new FileReader("C:\\Users\\yuval\\IdeaProjects\\Main\\src\\Files\\newfile.txt"))) {
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
