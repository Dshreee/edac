package session4;

import java.util.Scanner;

public class LabArray {
	static void avgArray() {
		Scanner in = new Scanner(System.in);
		
		int sum=0;
		System.out.println("Size of array - ");
		int arr[] = new int[in.nextInt()];
		for(int i=0;i<arr.length;i++)
			arr[i] = in.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("average ="+(float)(sum/arr.length));
		in.close();
	}
	
	static void revArray() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Size of array - ");
		int arr[] = new int[in.nextInt()];
		for(int i=0;i<arr.length;i++)
			arr[i] = in.nextInt();
		int arrrev[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arrrev[i] = arr[(arr.length-1)-i];
			System.out.print(arrrev[i]+" ");
		}
		
		in.close();
	}
	
	static int[] sortArray() {
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Size of array - ");
		int arr[] = new int[in.nextInt()];
		for(int i=0;i<arr.length;i++)
			arr[i] = in.nextInt();
		for(int i=0;i<=arr.length;i++) {
			for(int j=0;j<=arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp =arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]+" ");
		
		in.close();
		return arr;
	}
	
	static void maxArray() {
		int[] arr = new int[sortArray().length];
		arr = sortArray();
		System.out.println("maximum = "+arr[arr.length-1]+"2nd maximum = "+arr[arr.length-2]);
		
	}
	
	static void concatArray() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Size of array1 - ");
		int arr1[] = new int[in.nextInt()];
		System.out.println("Size of array2 - ");
		int arr2[] = new int[in.nextInt()];
		
		for(int i=0;i<arr1.length;i++)
			arr1[i] = in.nextInt();
		for(int i=0;i<arr2.length;i++)
			arr2[i] = in.nextInt();
		
		int size=arr1.length+arr2.length;
		int arr[] = new int[size];
		
		for(int i=0;i<arr1.length;i++)
			arr[i]=arr1[i];
		
		
		for(int i=arr1.length;i<size;i++)
		{
			for(int j=i-arr1.length;j<arr2.length;) {
				arr[i]=arr2[j];
				break;
			}
		}
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		in.close();
	}

	public static void main(String[] args) {
		
		
		System.out.println("Enter your option -");
		System.out.print("1. calculate avg of array values\n2. Reverse array\n3. Sort\n4. Max \n5.Concatenate arrays\n6.Exit\n");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		switch(n)
		{
		case 1:
			avgArray();
			break;
		case 2:
			revArray();
			break;
		case 3:
			sortArray();
			break;
		case 4:
			maxArray();
			break;
		case 5:
			concatArray();
			break;
		case 6:
			System.exit(0);
		}
		scan.close();
	}

}
