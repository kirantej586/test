package com.evaluate;

public class Factorial {
	
	public static int fact(int n){
		if(n==1) return 1;
		return fact(n-1)*n;
	}

	public static void main(String[] args) {
       System.out.println(fact(4));
	}
}
