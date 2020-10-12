package session4;

import java.util.Scanner;

public class Facto {

	public static void main(String[] args) {
		long fact=1;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=1;i<=n;i++)
			fact=fact*i;
		System.out.println("Factorial of "+n+" is "+fact);
		in.close();

	}

}
