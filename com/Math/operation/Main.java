package com.Math.operation;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.print("Enter your choice : \n"+
						"1. Addition  \n"+
				        "2. Subtration \n" +
						"3. Multiplication  \n" +
				        "4. Division  \n");
		int x = sc.nextInt();
		if(x == 1) {
			Addition add= new Addition(a,b);
			System.out.println(add.operation());

			}

			else if (x == 2) {
			Subtraction sub = new Subtraction(a,b);
			System.out.println(sub.operation());

			}

			else if(x== 3) {
			Division div = new Division(a,b); 
			System.out.println(div.operation());
			}
	 else if(x==4) {

				Multiply mul = new Multiply(a,b);
				System.out.println(mul.operation());
	 }

	 else {
				System.out.println("Invalid Choice ");
 }
}
}
				
			