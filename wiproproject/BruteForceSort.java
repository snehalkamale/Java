package wiproproject;
import java.util.Arrays;

public class BruteForceSort {

	public static void main(String[] args) {
		int[] arr = {5,99,39,65,77,15};
		int s[]= bruteforceSort(arr);
		for(int i: s) System.out.print(i+ " ");
	}

		public static int[] bruteforceSort(int[] arr) {
         int n= arr.length;
		for(int i=0; i<n;i++) {
		for(int j=0; j<n-i-1; j++) {
		if(arr[j] > arr[j+1]) {
		int temp = arr[j]; 
		arr[j]= arr[j+1];
		arr[j+1]= temp;

		}
		}
		}

		return arr;
	}
		}
