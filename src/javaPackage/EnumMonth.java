package javaPackage;

import java.util.EnumSet;

public class EnumMonth {
			enum month{
			January,
			february,march,april,may,june,july,aug,sep,oct,nov,dec
			}
			public static void main(String[] args)
			{
			EnumSet<month> months = EnumSet.allOf(month.class);
			System.out.println(months);
				
			}

}
