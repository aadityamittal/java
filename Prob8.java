package probs;

import java.util.Scanner;

class Prob8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j;
		int n = sc.nextInt();
		int k = n/2+1;
		for(i=1; i<=n/2+1; i++)
	    {   for(j = 1; j<k ;j++)
	    	{System.out.print(" ");
	    	}k--;
	        for(j=1; j<=i; j++)
	        {
	           System.out.print(j);
	        }
	        for(j=i-1; j>=1; j--)
	        {
	        	System.out.print(j);
	        }

	        System.out.println();
	    }
		k = n/2;
		for(i=n/2; i>=1; i--)
	    {
			for (int c = i; c <= n/2; c++)
			     System.out.print(" ");
	        for(j=1; j<=i; j++)
	        {
	            System.out.print(j);;
	        }
	        for(j=i-1; j>=1; j--)
	        {
	            System.out.print(j);
	        }

	        System.out.println();
	    }
	}
}
