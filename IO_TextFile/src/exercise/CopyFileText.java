package exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileText {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\SY\\Source.txt";
        String targetFile = "C:\\Users\\SY\\Target.txt";
        try {
            FileReader fileReader = new FileReader(sourceFile);
            FileWriter fileWriter = new FileWriter(targetFile);
            int character ;
            int count = 0 ;
            while ((character = fileReader.read()) != -1  ) {
                fileWriter.write(character);
                count++;
            }
            fileReader.close();
            fileWriter.close();
            System.out.println("file copied successfully.");
            System.out.println("Total number of characters in the file " + count);
        }catch (FileNotFoundException e ){
            System.err.println("Source file not exist");
        }catch (IOException e ){
            System.err.println("Error when coping files");
        }
    }
}
