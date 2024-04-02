import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFileWithScanner {
		public static void main(String[] args) throws IOException {
			if (args.length == 0) {
				System.out.println("ERROR: a file name must be given");
			} else  { 
				// The file is read and printed on screen line by line
				Scanner sc = new Scanner(new File(args[0]));
				while (sc.hasNextLine()) {
					System.out.println(sc.nextLine());
				}
				sc.close();
			}
		}
	}
