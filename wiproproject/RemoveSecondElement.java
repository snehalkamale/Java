package wiproproject;
import java.util.*;
import java.util.Arrays;

public class RemoveSecondElement {
	public static void main(String[] args) {
		 List<Integer> list = new ArrayList<Integer>
		 (Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		 
	        System.out.println("Original list:");
	        System.out.println(list);
	        removeSecondElement(list);
	        System.out.println("List after removing every second element:");
	        System.out.println(list);
	    }
	    public static void removeSecondElement(List<Integer> list) {
	        Iterator<Integer> iterator = list.iterator();
	        boolean removeNext = false;
	        while (iterator.hasNext()) {
	            iterator.next();
	            if (removeNext) {
	                iterator.remove();
	            }
	            removeNext = !removeNext;
	        }
	   }
		}