package wiproproject;
import java.util.Scanner;
import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]= {23,56,45,77,89,60,55};
		display(arr);

		System.out.println("Enter  number you want to  search");
		int p= sc.nextInt();
		int index =PerformLinearSearch(arr,p);
		System.out.print(index);

		}
		public static int PerformLinearSearch(int[] arr, int p) { 
			for(int i=0; i<arr.length; i++) {
				if(arr[i]==p) {
					return i;
				}
		}
	  return -1;
		}
       public static void display(int arr[]) {
			for(int item :arr)
				System.out.print(item +"  ");
			System. out.println();
		}
}
