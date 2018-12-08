package com.evaluate;

public class Fibbonaci {

    static int count=0,first=0,second=1,next=0;
	static void fib(int n){
		if(n > count){
			next=first+second;
			System.out.println(next);
			first=second;
			second=next;
			count++;
         fib(n);
		}
	}
	
	public static void main(String args[]){
		fib(8);
	}
}
