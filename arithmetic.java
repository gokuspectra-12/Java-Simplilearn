package intro;
import java.lang.Math;
import java.util.Scanner;

public class arithmetic {

	public static void main(String[] args) {
		int w;
		int x;
		int y;
		int fin;
		
		Scanner use = new Scanner(System.in);
		System.out.println("1 : Addition");
		System.out.println("2 : Subtraction");
		System.out.println("3 : Multiplication");
		System.out.println("4 : Division");
		
		w = use.nextInt();
		
		if(w == 1 ) {
			System.out.println("Enter a number");
			x = use.nextInt();
			System.out.println("Enter another number");
			y = use.nextInt();
			fin = x + y;
			System.out.println(fin);
		}
		
		if(w == 2 ) {
			System.out.println("Enter a number");
			x = use.nextInt();
			System.out.println("Enter another number");
			y = use.nextInt();
			fin = x - y;
			System.out.println(fin);
		}
		
		if(w == 3 ) {
			System.out.println("Enter a number");
			x = use.nextInt();
			System.out.println("Enter another number");
			y = use.nextInt();
			fin = x * y;
			System.out.println(fin);
		}
		
		if(w == 4) {
			System.out.println("Enter a number");
			x = use.nextInt();
			System.out.println("Enter another number");
			y = use.nextInt();
			if(y == 0) {
				throw new IllegalArgumentException("Error can't divide  by 0");
			}
			fin = x / y;
			
			System.out.println(fin);
		}

	}

}
