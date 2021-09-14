package ranlist;

import java.util.Scanner;

public class longincsub
{
 
	public int[] incseqsub(int[] lisub)
    {        
        int x = lisub.length - 1;
        int[] k = new int[x + 1];
        
        
        
        int[] d = new int[x + 1];  
         
        int ret = 1;
 
        
        
        for (int i = 1; i < x + 1; i++)
        {
            int j = 0;
 
 
            for (int thePosi = ret ; thePosi >= 1; thePosi--)
            {
                if (lisub[d[thePosi]] < lisub[i])
                {
                    j = thePosi;
                    break;
                }
            }            
            k[i] = d[j];
            if (j == ret || lisub[i] < lisub[d[j + 1]])
            {
                d[j + 1] = i;
                ret = Math.max(ret,j + 1);
            }
        }
 
       
 
        int[] theFin = new int[ret];
        int position = d[ret];
        for (int i = ret - 1; i >= 0; i--)
        {
            theFin[i] = lisub[position];
            position = k[position];
        }
        return theFin;             
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
