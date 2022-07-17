package Files;

import javax.management.openmbean.OpenDataException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        FileWriter myfile = null;
        try {
            myfile = new FileWriter("C:\\Users\\yuval\\IdeaProjects\\Main\\src\\Files\\newfile.txt");
            myfile.write("this is a data1234");
        }
        finally {
            if(myfile != null){
                System.out.println("Closing the file...");
                myfile.close();
            }
        }

    }
}
