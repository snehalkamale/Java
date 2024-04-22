package wiproproject;
import java.util.Scanner;
import java.util.Arrays;

public class SliceArray {

	public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			int arr[]= {23,56,45,77,89,99,83,109,};
			display(arr);
			System.out.println("Enter index no start and end from which you want  slice ");
			int a= sc.nextInt();
			int b= sc.nextInt();
			int[]x= SliceArray(arr,a,b);
			display(x);
			}
	     	public static int[] SliceArray(int[] arr, int a, int b) {
				int n;
				if(a == 0) n = b-a+2;
				else n =b-a+1;
				int ans [] =new int[n];
				int j=0 ;
				for(int i=0; i<n; i++) {
				ans[i] += arr[a+j];
               	j++ ;
				}
				return (ans);
			}

		public static void display(int arr[]) {
			for(int item: arr)
			System.out.print(item +" ");
			System.out.println();
			}

}