package wiproproject;
import java.util.Scanner;

public class RecursiveFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr =new int[n];
		arr[0] = 0;
		arr[1] = 1;
		for(int i=2; i<n; i++) {
		arr[i] = fibo (i, arr);

		}
		for(int i: arr) 
			System.out.print(i+ " ");
	}
		public static int fibo(int i, int[] arr) {  if(i ==0 ||i==1)
								
				return i;
		else
           return fibo(i-1,arr)+fibo(i-2,arr);
		}

		
	}


