import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter input filename:");
		// importedFile f1 = new importedFile(reader.nextLine()); System.out.println
		importedFile f1 = new importedFile("C:\\Users\\user\\Desktop\\sampleinput.txt");
		System.out.println("Enter the average waiting time:");
		int maxT = reader.nextInt();
		reader = f1.getFileScanner(reader);
		int size = reader.nextInt();
		PQueue.setSize(size);
		System.out.println(size);
		boolean run = true;
		while (run) {
			new Customer(reader.nextInt(), reader.nextInt(), reader.nextInt(), reader.nextInt());
			if (!reader.hasNextLine())
				run = false;
		}
		Customer.courrierCount(maxT);
	}
}

//this inner class is used to read files and was made this way because we
//didn't know if the vpl was going to have multiple inputs in the same phase
class importedFile {
	private File file = null;// the file is the input file and the scanner
	private Scanner fileScanner = null; // is made to scan over said file

	importedFile(String path) {// the path of the file is taken
		file = new File(path);// the file is created within the VM
		try {// surrounded with try-catch block in case the file is null
			fileScanner = new Scanner(file);// scanner is made to be the file's scanner
		} catch (FileNotFoundException e) {// catches the exception
			e.printStackTrace();
		}
	}

	Scanner getFileScanner(Scanner s) {// the scanner is returned
		return s = fileScanner;
	}

}
