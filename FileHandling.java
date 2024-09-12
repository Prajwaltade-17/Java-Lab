import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class FileHandling {
    public static void main(String[] args) {
        File file = new File("D:\\22UAi120\\FlashEL.txt");

        try {
            // Create the file if it does not exist
            if (file.createNewFile()) {
                System.out.println("File Created Successfully");
            } else {
                System.out.println("File already exists");
            }

            // Reading from the file
            try (FileReader fr = new FileReader(file);
                 BufferedReader br = new BufferedReader(fr)) {

                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }

            } catch (IOException e) {
                System.out.println("An error occurred while reading the file");
                e.printStackTrace();
            }

        } catch (IOException e) {
            System.out.println("An error occurred while creating the file");
            e.printStackTrace();
        }
    }
}
