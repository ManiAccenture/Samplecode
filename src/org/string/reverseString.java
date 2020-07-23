package org.string;

public class reverseString {
	
	public void reverse() {
		
		String s = "manikandan";
		System.out.println(s);
for(int i=s.length()-1;i>=0;i--) {
	System.out.println(s.charAt(i));
}
	}
	public static void main(String[] args) {
		
		reverseString r = new reverseString();
		r.reverse();
		
		
	}
	

	
}


