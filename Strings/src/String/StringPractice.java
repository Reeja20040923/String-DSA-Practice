package String;

import java.util.Arrays;

public class StringPractice {
	public static void main(String[] args) {
		String s="   welcome   ";
		//length
		s.length();
		System.out.println(s.length());
		
		//concat - joining
		String s1="java";
		String s2="Java";
		String s3="basics";
		System.out.println(s1.concat(s2));
		System.out.println(s1 + " " + s2);
		System.out.println(s1+s2+s3);
		
		
		// trim - remove spaces right n left
		System.out.println(s);
		System.out.println(s.trim());
		
		//CharAt - returns a char from str using indexing
		System.out.println(s.charAt(6));
		
		//contains() - returns a bool value --works like a subset check
		System.out.println(s.contains("Wel"));
		System.out.println(s.contains("wel"));
		
		//equals() , equalIsIgnorCase() -- compare str
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//replace -- replace single/multiple chars
		String s5 = "welcome to selenium java";
		System.out.println(s5.replace('e','x'));
		System.out.println(s5.replace("selenium", "playright"));
		
		//substring() --extracts strs from main string
		//straight idx=0;ending idx =1
		String s6="Selenium";
		System.out.println(s6.substring(1,5));
		System.out.println(s6.substring(0,3));
		
		//toUpperCase() toLowerCase()
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//split -- split into multiple parts based on delimeter
		String s7 = "reejayaramalla@gmail.com";
		String a[] = s7.split("@");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(Arrays.toString(a));
		
		
		
	
		
	}

}
