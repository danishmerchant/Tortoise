//1
package javaPackage;
import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter (n-1) number ");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int sum = (n*(n+1))/2;
		int suma = 0;
		for(int i=0;i<=n-2;i++) {
			suma += a[i];
		}
		int mis = sum - suma;
		System.out.println("Missing number " +mis);
	}
}