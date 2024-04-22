package com.Math.operation;

public class Division extends MathsOperation {
		int a;
		int b;
		Division(int a, int b){
		this.a = a;
		this.b = b;
}
		public int operation() {
			return a/b ;
		}
}
