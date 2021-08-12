import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class TestBufferedStreams {
    public static void main(String[] args) {
    try {
        FileInputStream input = new FileInputStream(args[0]);
        BufferedInputStream bufInput = new BufferedInputStream(input);
        try {
        FileOutputStream output = new FileOutputStream(args[1]);
        BufferedOutputStream bufOutput= new BufferedOutputStream(output);
        try {
        byte[] buffer = new byte[128];
        int line;
        // read the first line
        line = bufInput.read(buffer);
        while ( line != -1) {
        // write the line out to the output file
            bufOutput.write(buffer, 0, line);
            
            //bufOutput.new line();
            // read the next line
            line = bufInput.read(buffer);
        }
        } finally {
            bufOutput.close();
        }
        } finally {
             bufInput.close();
            }
            } catch (IOException e) {
              e.printStackTrace();
        }
    }
    
}

