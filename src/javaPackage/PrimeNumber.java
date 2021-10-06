package javaPackage;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Prime number in the list");
		int a[]= {1,7,20,7,15,31,48};
		boolean isprime = true;
		for(int i=0;i<a.length;i++) {
			isprime = true;
			for(int j=2;j<=a[i]/2;j++) {
				if(a[i]%j==0 || a[i]==1) {
					isprime = false;
				}
			}
			if(isprime)
				System.out.println(a[i]+" ");
		}
		System.out.println(" ");
	}
}