package javaPackage;

import java.util.Scanner;

public class P8 {
	void patt(int n) {
		for(int i=1;i<=2*n-1;i++) {
			if(i<=n) {
				for(int j=1;j<=n-i;j++) {
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++) {
					System.out.print("* ");
				}
			}
			else {
				for(int j=1;j<=i-n;j++) {
					System.out.print(" ");
				}
				for(int k=2*n-1;k>=i;k--) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		P8 p = new P8();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows ");
		int num = sc.nextInt();
		p.patt(num);
	}
}