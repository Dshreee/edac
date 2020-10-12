package session4;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int n1=0,n2=1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(n1+" ");
			int sum =n1+n2;
			n1 = n2;
            n2 = sum;
		}
		
		scan.close();

	}

}
