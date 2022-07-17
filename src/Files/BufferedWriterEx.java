package Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterEx {
    public static void main(String[] args) throws IOException {
        BufferedWriter buffer = null;
        FileWriter file = null;

        try {
            file = new FileWriter("C:\\Users\\yuval\\IdeaProjects\\Main\\src\\Files\\new file.txt");
            buffer = new BufferedWriter(file);
            buffer.write("Welcome to my file!");
            buffer.close();
            System.out.println("File was closed successfully");
        } finally {
            if (buffer != null) {
                buffer.close();
            }
        }
    }
}
