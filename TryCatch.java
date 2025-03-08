package basic;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		try {
		System.out.println("plz enter array size");
			Scanner sc=new Scanner(System.in);
			
			
			int[] arr=new int[sc.nextInt()];
			
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			
			System.out.println(Arrays.toString(arr));
		}
		catch(InputMismatchException a) {
			System.out.println("plz enter integer value");
Scanner sc=new Scanner(System.in);
			
			
			int[] arr=new int[sc.nextInt()];
			
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println(Arrays.toString(arr));
		}
	
		catch(NegativeArraySizeException b) {
			System.out.println("plz enter positive  integer value");
			Scanner sc=new Scanner(System.in);
						
						
						int[] arr=new int[sc.nextInt()];
						
						for(int i=0;i<arr.length;i++) {
							arr[i]=sc.nextInt();
						}
						System.out.println(Arrays.toString(arr));
		}
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
