//4
package javaPackage;
import java.util.Arrays;

public class Array4 {
	public static int getSecondLargest(int[] a, int size){  
			Arrays.sort(a);
		    return a[size-2];  
		}  
		public static void main(String args[]){  
		int a[]={1,2,5,6,3,2};  
		Arrays.sort(a);
		System.out.println("Second Largest: "+getSecondLargest(a,6));  
		}
	}