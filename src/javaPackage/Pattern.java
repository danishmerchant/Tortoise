package javaPackage;

public class Pattern {
	
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<i*2;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
