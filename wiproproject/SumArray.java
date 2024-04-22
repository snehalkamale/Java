package wiproproject;

public class SumArray {

	    public static void main(String[] args) {
		         	        int[] array = {5, 4, 9, 3, 6, 7};
	    	   		        int sum = SumArray(array, 0); 
	    			        System.out.println("Sum of array elements: " + sum);
	    			    }
	    			      public static int SumArray(int[]array,int index) {
	    			            if (index >= array.length) {
	    			            return 0;
	    			        }
	    			         return array[index] + SumArray(array, index + 1);
	    			    }
	    			
	    		

	    		}





