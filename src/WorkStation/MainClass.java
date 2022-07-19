package WorkStation;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class MainClass {
    public static void main(String[] args){
        char[] data = new char[100];
        try{
            FileReader input = new FileReader("C:\\Users\\yuval\\IdeaProjects\\Main\\src\\Files\\new file.txt",
                    StandardCharsets.US_ASCII);
            System.out.println(input.ready());
            System.out.println(input.getEncoding());
            System.out.println(input.skip(2));
            input.read(data);
            System.out.println(data);
        }catch (IOException e){
            System.out.println(e);
        }

        Thread newThread = new ThreadClass();
        newThread.start();
        System.out.println("This is the main Class");

        new Thread(() -> System.out.println("This is an anonymous thread")).start();
        new Thread(){
            public void run() {
                System.out.println("This is an anonymous thread");
            }
        }.start();
    }
}
