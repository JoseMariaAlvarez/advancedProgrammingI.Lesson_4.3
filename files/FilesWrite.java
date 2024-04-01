package files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.io.IOException;
import java.util.ArrayList;

public class FilesWrite {
	public static void main(String[] args) {
		try {
			ArrayList<String> lines = new ArrayList<>();
			lines.add("This is line 1");
			lines.add("This is line 2");
			lines.add("End");
			Files.write(Path.of("data.txt"), lines);
			OpenOption [] oo = {StandardOpenOption.APPEND};
			Files.write(Path.of("data.txt"), lines, oo);
		} catch (IOException e) {
			System.out.println("ERROR: unable to write into file");
		}
	}
}

