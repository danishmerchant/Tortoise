package javaPackage;

public class Source {
	public static void main(String[] args)
	{
		 int [] arr = new int [] {90, 34, 7, 99, 10,7,34,90};   
         
	        System.out.println("Duplicate elements in given array: ");  
	        //Searches for duplicate element  
	        for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  
	                    System.out.println(arr[j]);  
	            }  
	        }  
	}
}