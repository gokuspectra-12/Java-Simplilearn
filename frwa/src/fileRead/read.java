package fileRead;
import java.io.*;

public class read {

	public static void main(String[] args) {
		try {
			BufferedReader rd = new BufferedReader(
					new FileReader("C:\\Users\\Gokul\\Documents\\fo.txt"));
			String rs;
			while((rs = rd.readLine()) != null) {
				System.out.println(rs);
			}
			rd.close();
		}catch(Exception expt) {
			return;
		}
		// TODO Auto-generated method stub

	}

}
