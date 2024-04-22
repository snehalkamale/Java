package wiproproject;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.print("Enter your choice : \n"+
						"1. Addition  \n"+
				        "2. Subtration \n" +
						"3. Multiplication  \n" +
				        "4. Division  \n");
		int operator  = sc.nextInt();
	
		switch(operator) {
			case 1:
			int add = a+b;
			System.out.println(add);
			break;
		case 2:
			int sub = a-b;
			System.out.println(sub);
			break;
		case 3:
			int mul = a*b;
	    	System.out.println(mul);
		    break;
		case 4:
		   int div = a/b;
		    System.out.println(div);
		    break;
			
		default:

			System.out.println("Invalid Choice");
			break;
		}
		}

	}
