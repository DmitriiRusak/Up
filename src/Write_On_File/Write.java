package Write_On_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Write {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("SomeFile");
        PrintWriter printWriter= new PrintWriter(file);
        printWriter.println("chto napisat");
        printWriter.close();
    }
}
