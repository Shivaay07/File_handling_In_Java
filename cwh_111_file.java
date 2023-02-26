import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

// creating a new File
public class cwh_111_file {
    public static void main(String[] args) {
        File myFile = new File("createdFile.txt");
        try {
            myFile.createNewFile();
            System.out.println("file created successfully");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unable to create a file");
        }

        // writing in file

        try {
            FileWriter fileWriter = new FileWriter("createdFile.txt");
            fileWriter.write(
                    "Thank you for being a ray of sunshine even on my darkest days.");
            fileWriter.close();
            System.out.println("Writing operation in file is successful");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Writing operation in file is unsuccessful");
        }

        // Reading a file
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
                System.out.println("Reading file successfully.");
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Unable to read the file");
        }

        // Deleting a file

        if (myFile.delete()) {
            System.out.println("I have deleted: " + myFile.getName());
        } else {
            System.out.println("Some problem occurred while deleting the file");
        }

    }
}