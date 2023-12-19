package MethodBasics;

public class multiplication {

	//04-12-23
	//HW WAP  to define Multiplication and Pass 2 arguments  and display result
	public static void M1(int a,int b)
	{
		int result=a*b;
		System.out.println("multiplication 2 args result="+result);
	}
	 
	public static void M2(int a,int b,int c)
	{
		int result1=a*b*c;
		System.out.println("multiplication 3 args="+result1);
	}
	public static void main(String[] args) {	
		
		//calling methid its name
		M1(2,3);
		M2(2,3,4);
	}
}
