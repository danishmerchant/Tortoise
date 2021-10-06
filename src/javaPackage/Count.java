package javaPackage;

public class Count {

	public static void main(String[] args) {
		String s1 ="I am working at Neosoft . Neosoft Technologies Ltd is a CMM level 5 company. Neosoft has offices in Mumbai, pune and Noida.\r\n"
				+ "It's a service based company.";
		String[] s=s1.split(" ");
		int count =0;
		for(int i=1;i<s.length;i++) {
			if (s[i].equals("Neosoft")){
				count++;
			}
		}
		System.out.println(count);
	}
}