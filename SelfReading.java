import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SelfReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path path = Path.of("./src/SelfReading.java");
		List<String> code = Files.readAllLines(path);
		for(String line : code) {
			System.out.println(line);
		}

	}

}
