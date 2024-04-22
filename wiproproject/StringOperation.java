package wiproproject;
import java.util.Scanner;

public class StringOperation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Strings ");
		String p = s.next();
		String q =s.next();
		String ans = stringOperations(p,q);
		System.out.println(ans);
		}
		public static String stringOperations (String p, String q) {
			if(p.length()== 0 && q.length() == 0)
			return ("The strings are empty");
		String con = p+q; 
		System.out.println(con);
		StringBuilder sb= new StringBuilder(); 
		for(int i=con.length()-1; i>=0;i--) {
		char ch= con.charAt(i);
    	sb.append(ch);
		
	}
		System.out.println(sb.toString());
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of  middle string to cut : ");
		int n =s.nextInt();
		if(n > sb.length())
		return "Length is greater than actual String";
		else {
		 {
				 int start = (sb.length()-n)/2;
				 return sb.substring(start,start+n).toString();
		}
}
}
		}