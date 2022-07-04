import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {

	public static void main(String[] args) {
		File myFile = new File("archivo.txt");
		
		try {
			if (myFile.createNewFile()) {
				System.out.println("File created: " + myFile.getName());
			} else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
		
		try {
			FileWriter myFileWriter = new FileWriter("archivo.txt");
			myFileWriter.write("Files in Java might be tricky, but is fun enough!");
			myFileWriter.close();
			System.out.println("Succesfully wrote to the file");
		} catch (IOException e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
		
		try {
			Scanner myReader = new Scanner(myFile);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (IOException e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
	}
	
}
