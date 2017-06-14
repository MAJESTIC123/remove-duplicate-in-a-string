package logics;

import java.util.Scanner;

public class StringRemovingDuplicate {
	 public static void main(String[] args) {
		
		 System.out.println("Enter the string");
		 Scanner s=new Scanner(System.in);
		 String st=s.next();
		 String st1="";
		 for(int i=0;i<st.length();i++) {
			 char c=st.charAt(i);
			 if(c!=' ') {
				st1=st1+c;
				st=st.replace(c, ' ');
			 }
		 }
		 System.out.println(st1);
	}
}
