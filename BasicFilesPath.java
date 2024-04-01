import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BasicFilesPath {
	public static void main(String [] args) throws IOException  {
		Path p = Path.of("dir1/name.ext");
		
		if (Files.exists(p)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
			//Files.createDirectory(Path.of("dir1"));
			//Files.createFile(p);
		if (Files.exists(p)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		// is name.ext a directory?
		boolean isDirNameExt = Files.isDirectory(p);
		System.out.println(isDirNameExt);
	}
}
