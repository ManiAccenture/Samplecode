package org.string;


public class CountofString {
	public static void main(String[] args) {
		String s ="      manikandan is good boy";	
		System.out.println(s);
		 String trim = s.trim();
		System.out.println(trim);
	 int count = 0;
	
	for(int i=0;i<trim.length();i++) {
		if(trim.charAt(i)!=0) {
			count++;
		}
		
	}
	System.out.println(count);
	
	}
		
	}

