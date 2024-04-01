import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SelfReadingWithScanner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("./src/SelfReadingWithScanner.java"));
		
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		
	}

}
