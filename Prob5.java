package probs;

import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		System.out.print("Enter size of array: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		System.out.print("Enter array: ");
		for(int i=0; i<n ; i++){
		    a[i] = sc.nextInt();
		}
		
		System.out.print("Enter sum: ");
		
		int sum = sc.nextInt();
		
		for(int i = 0; i < n-2; i++)
		{
			for(int j = i+1; j < n-1; j++)
			{
				for(int k = j+1; k < n; k++)
				{
					if(a[i]+a[j]+a[k]==sum)
					{
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
						break;
					}
				}
			}
		}
		
	}

}
