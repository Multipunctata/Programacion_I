import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		File myFile= new File("archivo.txt");
		
		if (myFile.delete()) {
			System.out.printf("The file: %s has succesfully deleted", myFile.getName());
		} else {
			System.out.println("Failed to delete the file");
		}
	}
	
}
