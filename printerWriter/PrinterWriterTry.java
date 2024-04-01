package printerWriter;
import java.io.*;

public class PrinterWriterTry {
	public static void main(String[] args) throws IOException {
		if (args.length == 0) {
			System.out.println("ERROR: the file name must be given ");
		} else  { 
			// a file  is created and several words are written.
			try (PrintWriter pw = new PrintWriter(args[0])) {
				pw.println("amor roma mora ramo");
				pw.println("rima mira");
				pw.println("rail liar");
			} 
		}
	}
}
