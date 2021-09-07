package fileWrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class write {

	public static void main(String[] args) {
		try {
			BufferedWriter wr = new BufferedWriter(
					new FileWriter("C:\\Users\\Gokul\\Documents\\fo.txt"));
			wr.write("Gokul\n");
			wr.write("Kush\n");
			wr.write("Emily\n");
			wr.write("Maria\n");
			wr.write("Ben\n");
			wr.close();
		}catch(Exception exp) {
			return;
		}
			
		// TODO Auto-generated method stub

	}

}
