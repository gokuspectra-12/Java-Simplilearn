package ranlist;

import java.util.Scanner;

public class longincsub
{
 
	public int[] incseqsub(int[] item)
    {        
        int length = item.length;
        for(int i = 1; i<length; i++) {
        	int x = item[i];
        	int y = i - 1;
        	while(y >= 0 && item[y] > x) {
        		item[y+1] = item[y];
        		y = y - 1;
        	}
        	item[y+1] = x;
        	
        }
        return item;
    }    
        
        
        
 
    
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
        System.out.println("LIS program\n");
 
       
        
        System.out.println("Enter number of elements");
        int n = input.nextInt();
        int[] posA = new int[n];
        
        
        System.out.println("\nEnter "+ n +" elements");
        for (int i = 0; i < n; i++)
            posA[i] = input.nextInt();
 
        longincsub item = new longincsub(); 
        
        
        int[] theFin = item.incseqsub(posA);       
 
        
 
        System.out.print("\nLIS : ");
        for (int i = 0; i < theFin.length; i++)
            System.out.print(theFin[i] +" ");
        System.out.println();
    }
}
