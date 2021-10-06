package javaPackage;

public class Array {
	public static void main(String[] args) {
		int[] s = {1,2,3,4,5,6};
		int[] d = new int[6];
		
		for(int i=0;i<s.length;i++) {
		
		 d[i] = s[i];
		}
		System.out.print("elements of destination array = ");
		
		for(int i= 0;i<d.length;i++) {
			System.out.print(" "+d[i]);
		}
		
	}

}