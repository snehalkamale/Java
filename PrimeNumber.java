package traning;
import java.util.Scanner; 

public class PrimeNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); 
    System.out.println("Enter the number to check prime number");
    int x=sc.nextInt();
    int count=0;
    for(int i=1;i<=x;i++)
    {
    	if(x%i==0) {
    	count++;	
    	}
        }
    if(count==2) {
    	System.out.println("is a prime number");
    }else {
    	System.out.println("is  not a prime number");
    }
  }

}
