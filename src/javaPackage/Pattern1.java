package javaPackage;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows to print pattern ");
		int num = sc.nextInt();
		
		for(int i=0;i<=num;i++) {
			for(int j=1;j<=num-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<i*2;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}