import java.io.File; 
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import  java.io.BufferedWriter;
import  java.io.BufferedReader;
import java.util.Scanner;


public class EjemploArchivo {
    public static void main(String[]args){
        String f = System.getProperty("user.home");
        Scanner s =  new Scanner(System.in);
        String texto = s.nextLine();
        f += "\\"+texto.trim();
        File myFile = new File("f");
        System.out.println(f);
        if (myFile.exists()) {
            System.out.println("Existe");
            try {
                FileReader input = new FileReader(myFile);
                BufferedReader bufInput = new BufferedReader(input);
                String linea = null;
                while((linea=bufInput.readLine())!=null)
                {
                    System.out.println(linea);
                }
                bufInput.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        } else {
            System.out.println("No existe");
            try {
                FileWriter output = new FileWriter(myFile);
                BufferedWriter bufOutput = new BufferedWriter(output);
                texto= s.nextLine();
            
                bufOutput.write(texto);
                bufOutput.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
}