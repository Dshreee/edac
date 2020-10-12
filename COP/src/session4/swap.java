package session4;

public class swap {

	public static void main(String[] args) {
		int a=10,b=50;
		System.out.println("a= "+a+" b= "+b);
		a=a+b; //60
		b=a-b; //60-50=10
		a=a-b;  //60-10=50
		System.out.println("After swapping ");
		System.out.println("a= "+a+" b= "+b);
		

	}

}
