package wiproproject;
import java.util.Scanner;

public class Delete {
	
		public static void main(String[] args) {
			int a[]= {1,4,6,8,9};
			Scanner s=new Scanner(System.in);
			System.out.println("enter the number");
			int number=s.nextInt();
			for(int i=0;i<=a.length-1;i++)
			{
			  if(a[i]==number)
			  {
				 System.out.println("");

			  }
			  else {

			  System.out.println(a[i]+(0.20*a[i]));
		         }

			}
		}

	}
