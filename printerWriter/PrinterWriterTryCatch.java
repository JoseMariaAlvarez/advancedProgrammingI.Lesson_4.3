package printerWriter;

import java.io.IOException;
import java.io.PrintWriter;

public class PrinterWriterTryCatch {
	public static void main(String[] args)  {
		// a file is created and several words are written.
		try (PrintWriter pw = new PrintWriter(args[0])) {
			pw.println("high low hilly flat");
			pw.println("horizontal vertical");
			pw.println("guest host");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ERROR: the file name must be given");
		} catch (IOException e) {
			System.out.println("ERROR: problems with the file");
		}
	}
	}
