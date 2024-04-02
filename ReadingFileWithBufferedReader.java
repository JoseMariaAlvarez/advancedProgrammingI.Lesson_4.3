import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadingFileWithBufferedReader {
	public static void main(String[] args) throws IOException {
		if (args.length == 0) {
			System.out.println("ERROR: a file name must be given");
		} else  { 
			// The file is read and printed on screen line by line
			BufferedReader br = Files.newBufferedReader(Path.of(args[0]));
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
		}
	}

}
