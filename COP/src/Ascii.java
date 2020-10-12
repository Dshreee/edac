import java.util.Scanner;
public class Ascii {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String c = scan.next();
		System.out.println((int)c.charAt(0));
		scan.close();

	}

}
