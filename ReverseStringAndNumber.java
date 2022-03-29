//To Reverse a string and no.
package sample;

public class ReverseStringAndNumber {
	
	public static void main(String[] args) {
		
		String s = "MOM";
		int i = s.length();
		System.out.println(s.length());
		String rev ="";
		for(i=s.length()-1; i>=0 ; i--) {
		rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(s)) {
			
			System.out.println("Pal");
		}
		else {
			System.out.println("Not PAl");
		}
//	 StringBuffer str = new StringBuffer();
//	 str = str.append(s);
//	 StringBuffer rev = str.reverse();
//	 String i = String.valueOf(rev);
//	 int j = Integer.valueOf(i);
//	 System.out.println(rev);
//
//	if(j==s)
//		System.out.println("Pal");
//else 
//	System.out.println("Not PAl");	
		
//	    String str = "Radar", reverseStr = "";
//	    
//	    int strLength = str.length();
//
//	    for (int i = (strLength - 1); i >=0; --i) {
//	      reverseStr = reverseStr + str.charAt(i);
//	    }
//
//	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
//	      System.out.println(str + " is a Palindrome String.");
//	    }
//	    else {
//	      System.out.println(str + " is not a Palindrome String.");
//	    }
//	  }
}
}
