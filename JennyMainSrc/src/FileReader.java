package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    public static Scanner reader;

    public static String commandText = "";
    public static void Reader(String filename) throws FileNotFoundException {
        File file = new File(filename);
        reader = new Scanner(file);
        try {
            if (file.isFile() && file.getName().endsWith(".jen")) {
                //Actual File Reader is right here
                while (reader.hasNextLine()) {
                    commandText = commandText.concat(reader.nextLine()+" ");
                }

            } else {
                System.out.println("File not a Jenny source file or Jenny Header file");
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

    }
}
