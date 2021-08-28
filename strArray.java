package array;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
import java.util.Scanner; 


public class strArray {

	public static void main(String[] args) {
	    String[] email = {"boo@gmail.com","gop@gmail.com", "tar@gmail.com","pand@gmail.com",
	                     "mis@gmail.com", "poor@gmail.com","rus@gmail.com", "kot@gmail.com",
	                     "usa@gmail.com", "hay@gmail.com"};
	                     
	    Scanner use = new Scanner(System.in);

	    String em;
	    do {
	        System.out.println("Please enter email id available in array");
	        em = use.nextLine();
	    } while (!arrayContains(email, em));

	    System.out.println("Found");    
	}

	public static boolean arrayContains(String[] arr, String target) {
	    for(int i = 0; i < arr.length; i++) {
	        if (target.equals(arr[i])) {
	            return true;
	        }
	    }
	    return false;
	}
	

}
