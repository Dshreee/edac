package session4;

import java.util.Scanner;

public class palindro {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int pal=0;
		int temp=n;
		while(n!=0)
		{
			pal=pal*10+(n%10);
			n/=10;
		}
		if(pal==temp)
			System.out.println(temp+" is palindrome");
		else
			System.out.println(temp+" is'nt palindrome");
		
		in.close();
	}

}
