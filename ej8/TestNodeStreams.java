import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class TestNodeStreams {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream(args[0]);
            try {
            FileOutputStream output = new FileOutputStream(args[1]);
            try {
                byte[] buffer = new byte[128];
                int bytesRead;
                // read the first buffer
                bytesRead = input.read(buffer);
                while ( bytesRead != -1 ) {
                    // write buffer to the output file
                    output.write(buffer, 0, bytesRead);
                    
                    // read the next buffer
                    bytesRead = input.read(buffer);
                }

                } finally {
                    output.close();
                }
             } finally {
                 input.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
        }
    }
 }
