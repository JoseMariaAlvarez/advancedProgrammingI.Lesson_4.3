package files;

import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;

public class ReadAllLines {
	public static void main(String[] args) {
		try {
			List<String> lines = Files.readAllLines(Path.of("datos.txt"));
			for (String line : lines) {
				processLine(line);
			}
		} catch (IOException e) {
			System.out.println("ERROR: unable to read from file");
		}
	}
//	private static void processLine(String line) {
//		String[] data = line.split("\\s*[,;:.]\\s*");
//		for (String word : data) {
//			System.out.println(word);
//		}
//	}
	
	private static void processLine(String line) {
		try (Scanner sc = new Scanner(line)) {
			sc.useDelimiter("\\s*[,;:.]\\s*");
			while (sc.hasNext()) {
				String word = sc.next();
				System.out.println(word);
			}
		}
	}
}