package traning;
import java.util.Scanner; 
public class SwapInteger {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the value of a: ");
		int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
		int b = sc.nextInt();
		swap(a,b);
	}
	static void swap(int a, int b) {
		a = a+b;
		b = a-b;
		a = a-b;
		 System.out.println("a = " + a);
	        System.out.println("b = " + b);
	}
}
