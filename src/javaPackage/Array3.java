//3	
package javaPackage;
import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter array elements ");
		for(int i=0;i<size;i++) {
			a[i] =sc.nextInt();
		}
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		for(int i=0;i<size;i++) {
			if(a[i]==n) {
				count+=1;
			}
		}
		if(count>0) {
			System.out.println("Element found ");
		}
		else {
			System.out.println("Element not found");
		}
	}
}