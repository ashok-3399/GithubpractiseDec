package MethodBasics;

public class MethodReturnTypeInt {
	
	public static  int add(int a,int b)
	{
		int result=a+b;
		System.out.println("int result="+result);
		return result;
	}
	//05-12-23
//HW WAP to define method to perform subtsraction and return the o/p  and o.p+ 200 from main()
	public static int subtraction( int a ,int b) 
	{
		int result=a+b;
		System.out.println("result="+result);
		return result+200;
	}
	
	public static void main(String[] args) {
		 int x=add(10,20);
		 System.out.println("add int values="+x);
		 
		 int subresult=subtraction(50,50);
		 System.out.println("subtraction result="+subresult);

	}

}
