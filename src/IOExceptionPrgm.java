import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class IOExceptionPrgm {

    public static void main(String args[])  {

        try {
            File fn=new File("D:\\kavya\\value");
            FileReader fr=new FileReader(fn);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File Doesn't exist");
        }
    }
}
