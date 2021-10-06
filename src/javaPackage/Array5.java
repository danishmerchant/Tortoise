//5
package javaPackage;
public class Array5 {
	public static void main(String[] args) {
		int n[] = new int[] {2,45,34,56,76};
		int small=n[0];
		int large= n[0];
		for(int i=0;i<n.length;i++) {
			if(small>n[i]) {
				small = n[i];
			}
			else if(large < n[i]) {
				large = n[i];
			}
		}
		System.out.println("Largest number "+large);
		System.out.println("Smallest number "+small);
	}
}