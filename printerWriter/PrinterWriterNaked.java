package printerWriter;
import java.io.*;

public class PrinterWriterNaked {
	public static void main(String[] args) throws IOException {
		if (args.length == 0) {
			System.out.println("ERROR: the file name must be given");
		} else  { 
			// a file  is created and several Spanish words are written.
			PrintWriter pw = new PrintWriter(args[0]);
			pw.println("high low hilly flat");
			pw.println("horizontal vertical");
			pw.println("guest host");
			pw.close();
		}
	}
}
