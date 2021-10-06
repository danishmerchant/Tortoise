package javaPackage;

public class Sumofarray {
public static void main(String[] args) {
	int sum=0;
	int arr[] = new int[100];
	int a=0;
	
	for(int i=0;i<arr.length;i++) {
		arr[i]=a++;
		System.out.println("Elment in array "+arr[i]+"\t"+a);
		sum=sum+arr[i];
	}
	
	int max=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	System.out.println("largest number in arry " +max);
}
}
