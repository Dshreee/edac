/* program to check if two user-inputed arrays are equal or not
 * We can also use java.util.Arrays.equals() but for arrays to be 
 * equally true it requires both arrays element in exact order*/

package arrayequality;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayEqual {
	private static int arrsize1,arrsize2;
	static int arr1[] =  new int[50];
	static int arr2[] =  new int[50];
	public static void setArray() {			//setter function for both arrays
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of first array - ");
		arrsize1 = in.nextInt();
		System.out.println("Enter array elements - ");
		for(int i=0;i<arrsize1;i++) 
			arr1[i] = in.nextInt();
		
		System.out.println("Enter size of second array - ");
		arrsize2 = in.nextInt();
		System.out.println("Enter array elements - ");
		for(int i=0;i<arrsize2;i++) 
			arr2[i] = in.nextInt();
		System.out.println("Are the given arrays equal ? ");
		in.close();
	}
	
	public boolean isEqual(int[] a1,int[] a2) {			//return true if equal otherwise false
		int c=0;
		for(int i=0;i<arrsize1;i++) {
			if(a1[i]==a2[i])
				c++;
		}
		if(c==arrsize1)
			return true;
		else
			return false;
	}
	
	

	public static void main(String[] args) {
		ArrayEqual a1 = new ArrayEqual();
		setArray();
		if(arrsize1!=arrsize2)				//if no. of elements in both array are not equal
		{									//then the array is definitely not equal
			System.out.println(false);
			System.exit(0);
		}
		System.out.println(a1.isEqual(arr1,arr2));
		//OR
		System.out.println(Arrays.equals(arr1,arr2));  //use built-in function equals() available in java.util.Arrays package
		

	}

}
