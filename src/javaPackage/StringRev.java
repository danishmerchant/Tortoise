package javaPackage;

public class StringRev {

	public static void main(String[] args) {
		String mystring = "I am learning java programming.";
		
		int len = mystring.length();
		String rev = "";
		for(int i=len-1;i>=0;i--)  //using for loop
		{
			rev = rev + mystring.charAt(i);
		}
		System.out.println(rev); 
		
		//2.using stringbuffer class
		StringBuffer sf = new StringBuffer(mystring);
		System.out.println(sf.reverse());

	}

}
