package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the total number N: ");
		int n=in.nextInt();
		boolean[] Number=new boolean[n];					// Boolean type			
		for(int i=0;i<=n-1;i++) {
			Number[i]=true;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(Number[i-1]==true) {
				for(int j=i*i;j<=n;j+=i) {
					Number[j-1]=false;
				}
			}
		}
		for(int i=2;i<=n;i++) {  							// Original value for array
			if(Number[i-1]==true) {
				System.out.println(i);
			}
		}
	}

}
