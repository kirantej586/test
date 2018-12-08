package com.evaluate;

class A{
	private void display(){
		System.out.println("in A");
	}
}

public class OverloadingPrivateMethods extends A{
	
	@SuppressWarnings("finally")
	public int index(){
		int num[] = {1, 2, 3, 4};
		try{
		    System.out.println(num[5]);
		}catch(Exception e){
			System.out.println("Excepion block");
			return 1;
		}finally{
			System.out.println("Finally block");
			return 3;
		}
	}

	
	public static void main(String args[]){
		
		OverloadingPrivateMethods ob=new OverloadingPrivateMethods();
		int num= ob.index();
		System.out.println("return::"+num);
	}
	
}

