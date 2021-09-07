package fileAppend;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class append {

	public static void main(String[] args) {
	    try(PrintWriter ent = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\Gokul\\Documents\\fo.txt", true)))) {
	        ent.println("Everyone names is there.\n");
	    }catch (IOException exp) {
	        System.err.println(exp);
	    }
	  }
	
}
