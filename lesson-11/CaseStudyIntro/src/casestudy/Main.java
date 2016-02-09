package casestudy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Main {
	
	
	public static void main(String[] args) {
		
		// READ
		
		FileReader fr = new FileReader("nomefile.csv");
		BufferedReader br = new BufferedReader(fr);
		
	
		String row = br.readLine();
		// readline untile null
		
		String[] items = row.split(";");
		
		// WRITE
		
		FileWriter fw = new FileWriter("nomefileout.csv");
		PrintWriter pw = new PrintWriter(fw);
		
		// while ho dati da scrivere...
		pw.println("ciao a tutti;...");
		
		
		
		
		
		
		
	}

}
